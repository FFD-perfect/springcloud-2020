package cn.siwen.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2020-11-03 21:41
 */
@Data
@AllArgsConstructor//自动生成有参
@NoArgsConstructor//无参构造
public class Payment {
    private Integer id;
    private String serial;

    public Payment(long id, String serial) {
    }
}
