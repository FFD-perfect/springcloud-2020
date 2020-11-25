package cn.siwen.cloud.service.Impl;

import cn.siwen.cloud.dao.PaymentDao;
import cn.siwen.cloud.entity.Payment;
import cn.siwen.cloud.service.Paymentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2020-11-03 22:02
 */
@Service
public class PaymentServiceImpl implements Paymentservice {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }
    @Override
    public Payment findPaymentById(Integer id) {
        return paymentDao.findPaymentById(id);
    }
}
