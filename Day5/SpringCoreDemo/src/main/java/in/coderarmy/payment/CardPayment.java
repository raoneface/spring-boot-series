package in.coderarmy.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ca")
public class CardPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment by card");
    }
}
