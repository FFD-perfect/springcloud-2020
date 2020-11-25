package cn.siwen.cloud.config.impl;

import cn.siwen.cloud.config.HystrixOrderService;

public class Feign_Hystrix implements HystrixOrderService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return null;
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return null;
    }
}
