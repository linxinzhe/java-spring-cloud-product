package top.linxz.java.spring.cloud.sell.product.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.linxz.java.spring.cloud.sell.product.ProductApplicationTests;
import top.linxz.java.spring.cloud.sell.product.dataobject.ProductInfo;
import top.linxz.java.spring.cloud.sell.product.service.ProductService;

import java.util.List;

@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }
}