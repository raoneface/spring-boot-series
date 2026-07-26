package in.strikes.CrudSpringBootDemo.service;

import org.springframework.stereotype.Service;

import in.strikes.CrudSpringBootDemo.entity.Student;
import in.strikes.CrudSpringBootDemo.repository.StudentRepository;

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
        System.out.println("Inside student service");
        Student studentResponse = studentRepository.saveStudent(studentReq);
        System.out.println("Exiting student service");
        return studentResponse;
    }

    // 2. Business Logic

    // 3. Internet with DB to store

    // 4. Response back to client (Postman)

}
