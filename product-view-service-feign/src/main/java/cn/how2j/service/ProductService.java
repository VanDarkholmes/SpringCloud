package cn.how2j.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.how2j.client.ProductClientFeign;
import cn.how2j.pojo.Product;

@Service
public class ProductService {
    @Autowired ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();

    }
}