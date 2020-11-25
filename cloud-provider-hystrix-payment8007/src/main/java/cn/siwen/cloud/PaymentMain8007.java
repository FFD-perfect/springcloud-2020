package cn.siwen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients//该注解的作用是扫描标记FeignClients接口并创建实例bean,默认扫描并创建所在目录下的包
public class PaymentMain8007 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8007.class,args);
    }
}
