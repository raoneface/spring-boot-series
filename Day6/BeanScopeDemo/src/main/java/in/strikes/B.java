package in.strikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class B {
    private OrderService orderService;

    @Autowired
    public B(OrderService orderService){
        this.orderService=orderService;
        System.out.println("B object");
    }

}
