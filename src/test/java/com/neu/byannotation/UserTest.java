package com.neu.byannotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest
{

    @Test
    public void testToString() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("byannotation.xml");
        User user = (User)context.getBean("user");
        System.out.println(user.toString());
    }
}