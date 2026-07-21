package in.coderarmy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        // every bean is an object but every object is not a bean

        // reflection api -->

        // java there is class named Class
        Class <Student>c1 = Student.class;
        // c1 is not an object here but is stores metadata of Studnet class and metadata cames from reflection api

        // it is a container which manage the beans and do dependencies injection
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // AppConfig.class --> it is reflection api

        OrderService order = context.getBean(OrderService.class);
        order.orderService();
        User user1 = context.getBean(User.class);
        user1.detail(user1);
    }
}
class Student{
    private String name;
    private int age;
    public Student(){
    }
    public void getAttendence(){
    }
}
