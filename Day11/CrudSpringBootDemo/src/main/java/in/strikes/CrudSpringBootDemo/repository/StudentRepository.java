package in.strikes.CrudSpringBootDemo.repository;

import org.springframework.stereotype.Component;

import in.strikes.CrudSpringBootDemo.entity.Student;

@Component
public class StudentRepository {
    public Student saveStudent(Student StudnetReq) {
        // save to db
        System.out.println("inside Student repository");
        System.out.println("Exiting student repository");
        return null;
    }
}
