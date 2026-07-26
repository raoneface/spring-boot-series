package in.strikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class A {
    private OrderService orderService;

    @Autowired
    public A(OrderService orderService){
        this.orderService = orderService;
        System.out.println("A object");
    }

}
