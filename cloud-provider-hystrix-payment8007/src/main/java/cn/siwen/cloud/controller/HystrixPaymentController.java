package cn.siwen.cloud.controller;

import cn.siwen.cloud.service.HystrixPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class HystrixPaymentController {

    @Resource
    private HystrixPaymentService hystrixPaymentService;


    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
            return hystrixPaymentService.paymentInfo_Ok(id);
    }
    //Timeout超时
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        return hystrixPaymentService.paymentInfo_Timeout(id);
    }


}
