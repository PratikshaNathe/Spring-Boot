package in.coderarmy;

import in.coderarmy.services.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService ;

    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;

    }

    public void order(){

        paymentService.pay();
        System.out.println("order placed");
    }
}
