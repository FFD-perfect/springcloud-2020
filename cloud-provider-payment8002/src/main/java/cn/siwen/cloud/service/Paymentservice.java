package cn.siwen.cloud.service;

import cn.siwen.cloud.entity.Payment;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2020-11-03 22:01
 */
@Service
public interface Paymentservice {

     public int addPayment(Payment payment);

    public Payment findPaymentById(Integer id);

}
