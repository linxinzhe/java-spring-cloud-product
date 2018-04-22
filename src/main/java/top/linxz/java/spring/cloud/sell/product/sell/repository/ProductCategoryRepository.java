package top.linxz.java.spring.cloud.sell.product.sell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.linxz.java.spring.cloud.sell.product.sell.dataobject.ProductCategory;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
