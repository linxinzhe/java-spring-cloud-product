package top.linxz.java.spring.cloud.sell.product.sell.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.linxz.java.spring.cloud.sell.product.sell.dataobject.ProductInfo;
import top.linxz.java.spring.cloud.sell.product.sell.enums.ProductStatusEnum;
import top.linxz.java.spring.cloud.sell.product.sell.repository.ProductInfoRepository;
import top.linxz.java.spring.cloud.sell.product.sell.service.ProductService;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
