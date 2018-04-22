package top.linxz.java.spring.cloud.sell.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.linxz.java.spring.cloud.sell.product.dataobject.ProductCategory;
import top.linxz.java.spring.cloud.sell.product.repository.ProductCategoryRepository;
import top.linxz.java.spring.cloud.sell.product.service.CategoryService;

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
