package top.linxz.java.spring.cloud.sell.product.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.linxz.java.spring.cloud.sell.product.dataobject.ProductCategory;
import top.linxz.java.spring.cloud.sell.product.service.CategoryService;

import java.util.Arrays;
import java.util.List;

public class CategoryServiceImplTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(list.size() > 0);
    }
}