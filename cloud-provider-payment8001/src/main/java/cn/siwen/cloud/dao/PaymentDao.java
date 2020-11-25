package cn.siwen.cloud.dao;

import cn.siwen.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shkstart
 * @create 2020-11-03 21:37
 */
@Mapper
public interface PaymentDao {
/*
  增加一笔订单
 */
    public int addPayment(Payment payment);

    public Payment findPaymentById(@Param("id") Integer id);
}
