package in.strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order1 = context.getBean(OrderService.class);
        order1.orderPlace();
        OrderService order2 = context.getBean(OrderService.class);
        order2.orderPlace();
        System.out.println(order1==order2);

        
    }
}