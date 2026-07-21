package in.strikes;

import in.strikes.simple.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class);
        order.orderPlaced();
//        A a1 = context.getBean( A.class);
//        a1.printa();

    }
}