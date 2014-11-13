package com.neu.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = {"/lifecycle.xml"})
public class CashierTest extends AbstractTestNGSpringContextTests
{
    @Autowired
    private Cashier cashier;
    @Test
    public void testCheckout() throws Exception
    {
        cashier.checkout();
    }
}