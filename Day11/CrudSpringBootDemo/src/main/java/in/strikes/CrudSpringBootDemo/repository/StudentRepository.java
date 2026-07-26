package in.strikes.CrudSpringBootDemo.repository;

import org.springframework.stereotype.Component;

import in.strikes.CrudSpringBootDemo.entity.Student;

@Component
public class StudentRepository {
    public Student saveStudent(Student StudnetReq) {
        // save to db
        System.out.println("inside Student repository");
        System.out.println("Exiting student repository");
        Student s1 = new Student();
        s1.setName("Shubham");
        s1.setAge(28);
        s1.setEmail("Raoneface@gmail.com");
        s1.setRollNo(101);
        s1.setSubject("ml");
        return s1;
    }
}
