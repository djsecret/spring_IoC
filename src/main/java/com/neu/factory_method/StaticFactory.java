package com.neu.factory_method;

/**
 * 使用静态工厂方法创建bean
 * Created by ubuntu on 14-11-8.
 */
public class StaticFactory
{
    public static Product createProduct(String name)
    {
        if("aaa".equals(name))
        {
            return new Product("AAA",2.5);
        }
        else if("cdrw".equals(name))
        {
            return new Product("CDRW",1.5);
        }
        throw new IllegalArgumentException("Unknown product");
    }
}
