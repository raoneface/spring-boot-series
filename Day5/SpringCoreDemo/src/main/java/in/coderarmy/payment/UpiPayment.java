package in.coderarmy.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("up")
public class UpiPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment by upi");
    }
}
