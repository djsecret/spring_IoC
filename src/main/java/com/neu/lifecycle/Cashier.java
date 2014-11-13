package com.neu.lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.util.Date;

/**
 * “对于prototype作用域的bean，有一点非常重要，那就是Spring不能对一个 prototype bean的整个生命周期负责：
 * 容器在初始化、配置、装饰或者是装配完一个prototype实例后，将它交给客户端，随后就对该prototype实例不闻不问了。
 * 不管何种作用域，容器都会调用所有对象的初始化生命周期回调方法，而对prototype而言，任何配置好的析构生命周期回调方法都将不会被调用。
 * 清除prototype作用域的对象并释放任何prototype bean所持有的昂贵资源，都是客户端代码的职责.”
 *
 * Created by ubuntu on 14-11-10.
 */
@Component
public class Cashier implements BeanNameAware
{
    @Value("cashier")
    private String name;
    @Value("/home/ubuntu/IdeaProjects/spring_IoC")
    private String path;
    private BufferedWriter writer;

    public Cashier()
    {
        System.out.println("constructor");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        System.out.println("set name");
        this.name = name;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        System.out.println("set path");
        this.path = path;
    }
    @PostConstruct
    public void openFile() throws IOException
    {
        System.out.println("open file");
        File logFile = new File(path, name + ".txt");
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logFile, true)));
    }

    public void checkout() throws IOException
    {
        writer.write(new Date() + "checkout\n");
        writer.flush();
    }

    @PreDestroy
    public void closeFile() throws IOException
    {
        System.out.println("close file");
        writer.close();
    }

    public static void main(String[] args) throws IOException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        Cashier cashier = (Cashier) context.getBean("cashier");
        cashier.checkout();

        Cashier cashier1 = (Cashier) context.getBean("cashier");
        cashier1.checkout();

        ((ClassPathXmlApplicationContext) context).close();
    }

    @Override
    public void setBeanName(String name)
    {
        System.out.println("bean name :" + name);
    }
}
