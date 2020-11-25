package cn.siwen.cloud;


import cn.siwen.cloud.entity.CommonResult;
import cn.siwen.cloud.entity.Payment;
import cn.siwen.cloud.service.Paymentservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shkstart
 * @create 2020-11-03 22:27
 */
@Slf4j
@RestController
public class PaymentController {
    @Autowired
    private Paymentservice paymentservice;

    @PostMapping(value = "/payment/add")
    public CommonResult addPayment(@RequestBody Payment payment){
        int result=paymentservice.addPayment(payment);
        if (result>0){
            return  new CommonResult(200,"success",payment);
        }else{
            return new CommonResult(888,"faild");
        }
    }
    @GetMapping (value = "/payment/find/{id}")
    public CommonResult findPayment(@PathVariable int id){
        Payment payment=paymentservice.findPaymentById(id);
        if (payment!=null){
            return  new CommonResult(200,"success/查询ID:"+id,payment);
        }else{
            return new CommonResult(999,"faild");
        }
    }

}
