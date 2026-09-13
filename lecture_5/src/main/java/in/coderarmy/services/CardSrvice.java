package in.coderarmy.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CardSrvice implements PaymentService{

    @Override
    public void pay(){
        System.out.println("pay via card");
    }
}
