package cn.siwen.cloud.service;

import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class HystrixPaymentService{
    //成功
    public String paymentInfo_Ok(Integer id) {
        return "线程池" + Thread.currentThread().getName() + "paymentInfo_OK,id:" + id + "\t" + "成功";

    }
    //timeout超时
        public String paymentInfo_Timeout(Integer id){
        int timeNumber=3;
        try{
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "线程池" + Thread.currentThread().getName() + "paymentInfo_Timeout,id:" + id + "\t" + "失败"+"耗时(秒)"+timeNumber;
    }

}
