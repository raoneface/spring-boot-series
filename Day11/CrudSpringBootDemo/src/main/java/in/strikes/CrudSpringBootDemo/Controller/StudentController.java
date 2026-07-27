package in.strikes.CrudSpringBootDemo.Controller;

import in.strikes.CrudSpringBootDemo.entity.Student;
import in.strikes.CrudSpringBootDemo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    ;
    // create
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
       Student createdStudent = studentService.createStudent(student);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);
    }

    // read one record
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student studentResponse = studentService.getStudent(id);
        if(studentResponse == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentResponse);
    }

    // read all record
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
       List<Student>  studentList = studentService.getAllStudent();
        if(studentList.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentList);
    }

    // update
    @PutMapping("/Update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id,
                                                @RequestBody Student studentReq){
        Student studentResponse = studentService.updateStudent(id,studentReq);
        if(studentResponse == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentResponse);
    }

    // delete
    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
            Boolean isDeleted = studentService.deleteStudent(id);

            if(!isDeleted){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok("Record deleted");
    }
}
