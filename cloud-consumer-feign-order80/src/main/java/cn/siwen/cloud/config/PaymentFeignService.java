package cn.siwen.cloud.config;

import cn.siwen.cloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "PAYMENT")
public interface PaymentFeignService {
    @GetMapping(value = "/paayment/find/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id);
}
