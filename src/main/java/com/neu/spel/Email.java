package com.neu.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Email中的属性，用EmailUtilities实例中的属性值来注入
 * Created by djsecret on 14-11-8.
 */
@Component
public class Email
{
    //引用bean
    @Value("#{emailUtilities}")
    private EmailUtilities emailUtilities;
    //bean中的属性
    @Value("#{emailUtilities.email}")
    private String email;
    @Value("#{emailUtilities.password}")
    private String password;
    @Value("#{emailUtilities.host}")
    private String host;
    //bean中的方法
    @Value("#{emailUtilities.toString()?.toUpperCase()}")
    private String emailStr;

    @Override
    public String toString()
    {
        return "Email{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", host='" + host + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spel.xml");
        Email email = (Email)context.getBean("email");
        System.out.println(email);
        System.out.println(email.emailStr);
        System.out.println(email.emailUtilities);
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getHost()
    {
        return host;
    }

    public void setHost(String host)
    {
        this.host = host;
    }
}
