package com.neu.byxml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest
{

    @Test
    public void testToString() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("byxml.xml");
        User user = (User)context.getBean("user1");
        System.out.println(user.toString());
    }
}