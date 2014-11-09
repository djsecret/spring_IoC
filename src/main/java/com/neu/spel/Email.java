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
    //bean中的属性并在属性上做计算等操作
    @Value("#{emailUtilities.email}")
    private String email;
    @Value("#{emailUtilities.count + 12}")
    private int count;
    @Value("#{'http://' + emailUtilities.host}")
    private String host;
    //bean中的方法
    @Value("#{emailUtilities.toString()?.toUpperCase()}")
    private String emailStr;

    //调用类和类中静态属性或者方法
    /*
    等于      ==  eq
    小于      <   lt
    小于等于   <=  le
    大于      >   gt
    大于等于   >=  ge
     */
    @Value("#{T(java.lang.Math).PI le 100}")
    private boolean isLittle;

    //正则表达式
    @Value("#{email.email matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com'}")
    private boolean isValidEmail;

    @Override
    public String toString()
    {
        return "Email{" +
                "emailUtilities=" + emailUtilities +
                "\n email='" + email + '\'' +
                "\n count=" + count +
                "\n host='" + host + '\'' +
                "\n emailStr='" + emailStr + '\'' +
                "\n isLittle='" + isLittle + '\'' +
                "\n isValidEmail='" + isValidEmail + '\'' +
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

    public EmailUtilities getEmailUtilities()
    {
        return emailUtilities;
    }

    public void setEmailUtilities(EmailUtilities emailUtilities)
    {
        this.emailUtilities = emailUtilities;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public String getEmailStr()
    {
        return emailStr;
    }

    public void setEmailStr(String emailStr)
    {
        this.emailStr = emailStr;
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
