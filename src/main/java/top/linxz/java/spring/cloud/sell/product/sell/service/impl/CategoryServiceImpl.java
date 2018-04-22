package top.linxz.java.spring.cloud.sell.product.sell.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.linxz.java.spring.cloud.sell.product.sell.dataobject.ProductCategory;
import top.linxz.java.spring.cloud.sell.product.sell.repository.ProductCategoryRepository;
import top.linxz.java.spring.cloud.sell.product.sell.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }
}
