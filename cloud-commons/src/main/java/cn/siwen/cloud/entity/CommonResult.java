package cn.siwen.cloud.entity;

import lombok.Data;

/**
 * @author shkstart
 * @create 2020-11-03 20:56
 */
@Data
//@AllArgsConstructor//自动生成有参
//@NoArgsConstructor//无参构造
public class CommonResult<T> {
    private  Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message,T data) {
        this.code = code;
        this.message = message;
        this.data=data;
    }

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data=null;
    }
}
