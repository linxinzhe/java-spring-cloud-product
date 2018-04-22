package top.linxz.java.spring.cloud.sell.product.sell.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.linxz.java.spring.cloud.sell.product.sell.dataobject.ProductCategory;
import top.linxz.java.spring.cloud.sell.product.sell.service.CategoryService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CategoryServiceImplTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(list.size() > 0);
    }
}