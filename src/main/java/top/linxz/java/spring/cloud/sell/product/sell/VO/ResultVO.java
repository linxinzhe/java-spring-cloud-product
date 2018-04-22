package top.linxz.java.spring.cloud.sell.product.sell.VO;

import lombok.Data;

@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;

    private T data;
}
