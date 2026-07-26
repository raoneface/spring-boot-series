package in.strikes.CrudSpringBootDemo.Controller;

import in.strikes.CrudSpringBootDemo.entity.Student;
import in.strikes.CrudSpringBootDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // create
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        System.out.println("Inside Student controller");
        Student createdstudent = studentService.createStudent(student);
        System.out.println("existing student controller");
        return createdstudent;
    }

    // read

    // update

    // delete
}
