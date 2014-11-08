package com.neu.factory_method;

import java.util.Map;

/**
 * 使用实例工厂方法创建bean
 * 本例中，配置map存储预定义的产品，creatProduct()实例工厂方法通过在map中搜索提供的name，寻找一个产品，如果找不到匹配的，那么抛出异常
 * Created by ubuntu on 14-11-8.
 */
public class InstanceFactory
{
    private Map<String,Product> products;

    public void setProducts(Map<String, Product> products)
    {
        this.products = products;
    }

    public Product createProduct(String name)
    {
        Product product = products.get(name);
        if(product != null)
        {
            return product;
        }
        else
        {
            throw new IllegalArgumentException("Unknown product");
        }
    }
}
