package com.neu.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * Created by ubuntu on 14-11-8.
 */
@Component
public class EmailUtilities
{
    //字面值
    @Value("#{'aaa@163.com'}")
    private String email;
    @Value("#{'123'}")
    private String password;
    @Value("#{'www.163.com'}")
    private String host;

    @Value("#{systemEnvironment}")
    private Properties properties;

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

    @Override
    public String toString()
    {
        return "EmailUtilities{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", host='" + host + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spel.xml");
        EmailUtilities emailUtilities = (EmailUtilities)context.getBean("emailUtilities");
        System.out.println(emailUtilities);
        System.out.println(emailUtilities.properties);
    }
}
