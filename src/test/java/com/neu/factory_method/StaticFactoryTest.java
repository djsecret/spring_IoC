package com.neu.factory_method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryTest
{

    @Test
    public void testCreateProduct() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("factory_method.xml");
        Product aaa = (Product)context.getBean("aaa");
        System.out.println(aaa);
        Product cdrw = (Product)context.getBean("cdrw");
        System.out.println(cdrw);
    }
}