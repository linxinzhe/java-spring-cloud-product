package top.linxz.java.spring.cloud.sell.product.sell.service;

import top.linxz.java.spring.cloud.sell.product.sell.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {

    List<ProductInfo> findUpAll();
}
