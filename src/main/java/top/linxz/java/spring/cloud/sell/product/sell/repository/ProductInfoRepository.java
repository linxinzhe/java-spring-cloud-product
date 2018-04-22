package top.linxz.java.spring.cloud.sell.product.sell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.linxz.java.spring.cloud.sell.product.sell.dataobject.ProductInfo;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
