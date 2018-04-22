package top.linxz.java.spring.cloud.sell.product.service;

import top.linxz.java.spring.cloud.sell.product.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
