package in.coderarmy.services;

import org.springframework.stereotype.Component;

@Component
public class UpiService implements PaymentService{
    public void pay(){
        System.out.println("pay via UPI");
    }
}
