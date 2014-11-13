package com.neu.message_resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Locale;

/**
 * 国际化示例
 * Created by ubuntu on 14-11-13.
 */
@Component
public class I18N implements MessageSourceAware
{
    private MessageSource messageSource;

    @Override
    public void setMessageSource(MessageSource messageSource)
    {
        this.messageSource = messageSource;
    }

    public void checkout(String name)
    {
        String alter = messageSource.getMessage("alter.hello",new Object[]{name,new Date()}, Locale.US);
        System.out.println(alter);
    }

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("message_resource.xml");
        //使用ApplicationContext中的getMessage方法直接访问
        String alter = context.getMessage("alter.hello",new Object[]{"张三",new Date()}, Locale.CHINA);
        System.out.println(alter);

        //实现了MessageSourceAware或者ApplicationContextAware接口的bean，也可以得到MessageSource，然后调用getMessage方法
        I18N i18N = (I18N)context.getBean("i18N");
        i18N.checkout("lisi");
    }

}
