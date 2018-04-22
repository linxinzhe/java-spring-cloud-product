package top.linxz.java.spring.cloud.sell.product.sell.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;
import top.linxz.java.spring.cloud.sell.product.ProductApplicationTests;
import top.linxz.java.spring.cloud.sell.product.sell.ProductApplication;
import top.linxz.java.spring.cloud.sell.product.sell.dataobject.ProductInfo;
import top.linxz.java.spring.cloud.sell.product.sell.service.ProductService;

import java.util.List;

import static org.junit.Assert.*;

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