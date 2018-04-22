package top.linxz.java.spring.cloud.sell.product.sell.utils;

import top.linxz.java.spring.cloud.sell.product.sell.VO.ResultVO;

public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
