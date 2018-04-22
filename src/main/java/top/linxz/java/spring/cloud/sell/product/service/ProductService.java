package top.linxz.java.spring.cloud.sell.product.service;

import top.linxz.java.spring.cloud.sell.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {

    List<ProductInfo> findUpAll();
}
