package in.strikes.CrudSpringBootDemo.service;

import org.springframework.stereotype.Service;

import in.strikes.CrudSpringBootDemo.entity.Student;
import in.strikes.CrudSpringBootDemo.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // 1. End Point Listen (/app/student Post)
    public Student createStudent(Student studentReq) {
        // some business logic
        // store to
     
        Student studentResponse = studentRepository.save(studentReq);
        return studentResponse;
    }

    public Student getStudent(Long id){
        Optional<Student> studentResponse = studentRepository.findById(id);
        if(studentResponse.isPresent()){
            return studentResponse.get();
        }else return null;
    }

    public List<Student> getAllStudent(){
         List<Student> allStudent =studentRepository.findAll();
         return allStudent;
    }

    public Student updateStudent(Long id , Student studentReq){
        Optional<Student> existingStudent = studentRepository.findById(id);

        if(existingStudent.isEmpty()){
            return null;
        }

        Student studentToSave = existingStudent.get();

        studentToSave.setName(studentReq.getName());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setAge(studentReq.getAge());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setSubject(studentReq.getSubject());

        return studentRepository.save(studentToSave);
    }

    public boolean deleteStudent(Long id){
        Boolean isStudent = studentRepository.existsById(id);

        if(!isStudent) return false;

        studentRepository.deleteById(id);
        return true;
    }

    }
    // 2. Business Logic


    // 3. Internet with DB to store

    // 4. Response back to client (Postman)


