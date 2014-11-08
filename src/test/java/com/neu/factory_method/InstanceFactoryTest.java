package com.neu.factory_method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceFactoryTest
{

    @Test
    public void testCreateProduct() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("factory_method.xml");
        Product aaa1 = (Product)context.getBean("aaa1");
        System.out.println(aaa1);

        Product cdrw1 = (Product)context.getBean("cdrw1");
        System.out.println(cdrw1);
    }
}