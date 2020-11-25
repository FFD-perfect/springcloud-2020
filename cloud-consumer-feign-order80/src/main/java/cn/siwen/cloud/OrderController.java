package cn.siwen.cloud;

import cn.siwen.cloud.config.PaymentFeignService;
import cn.siwen.cloud.entity.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {
   private static final String PAYMENT_URL = "http://PAYMENT";   //http://localhost:8001
    @Autowired
    private PaymentFeignService paymentFeignService;


    @GetMapping("/consume/order/{id}")
    public CommonResult orderfind(@PathVariable("id") Integer id) {
                return paymentFeignService.getPaymentById(id);
        	    }
   /* @GetMapping("/consume/create")
    public CommonResult<Payment> ordercreate(Payment payment)
    { return restTemplate.postForObject(PAYMENT_URL + "/payment/add", payment, CommonResult.class);

        	    }*/
	}


