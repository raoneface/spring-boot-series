package in.strikes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public OrderService(){
        System.out.println("Order service created");
    }
    public void placeOrder() {
        System.out.println("Order placed");
    }
}
