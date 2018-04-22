package top.linxz.java.spring.cloud.sell.product.sell.service;

import top.linxz.java.spring.cloud.sell.product.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
