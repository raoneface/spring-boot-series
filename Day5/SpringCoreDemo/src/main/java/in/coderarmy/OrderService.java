package in.coderarmy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private  PaymentService service;

    // dependencies injection through constructor
    //    @Autowired
    //    OrderService(PaymentService service){
    //        this.service=service;
    //    }

    // dependencies injection through setter
//    @Autowired
//    public void setPaymentService(PaymentService service){
//        this.service = service;
//    }

    public void orderService(){
        service.pay();
        System.out.println("Order service executed");
    }
}
