package com.neu.lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CashierTest
{

    @Test
    public void testCheckout() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        Cashier cashier = (Cashier)context.getBean("cashier");
        cashier.checkout();
    }
}