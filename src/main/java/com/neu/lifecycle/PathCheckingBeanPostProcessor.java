package com.neu.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * 用于检查路径的bean后处理器
 * 进行路径检查的最佳时机是初始化函数中打开文件之前，所以实现postProcessBeforeInitialization（）方法进行逐一检查
 * StorageConfig是一个标记接口，只有实现了这个接口的bean，才进行路径检查
 *
 * 实现PriorityOrdered接口的原因：
 * 如果使用xml配置初始化和销毁方法，那么不需要实现这个接口，但是，如果使用PostConstruct和PreDestroy注解来实现配置，那么
 * 一定使用了context:component-scan或者context:annotation-config这样的配置，他们会自动注册CommonAnnotationBeanPostProcessor
 * 后处理器，用来识别PostConstruct和PreDestroy注解，而且，优先级比你自己定义的后处理器优先级高，这样，不能保证你的后处理器在初始化方法
 * 执行之前被调用。为了保证这样，需要手动设置后处理器的优先级，就要实现PriorityOrdered接口，其中有getOrder方法，返回值小，优先级高，默认返回0
 * 那么就使用这个0就行了。
 * Created by ubuntu on 14-11-13.
 */
@Component
public class PathCheckingBeanPostProcessor implements BeanPostProcessor,PriorityOrdered
{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("postProcessBeforeInitialization");
        if(bean instanceof StorageConfig)
        {
            String path = ((StorageConfig)bean).getPath();
            System.out.println(path);
            File file = new File(path);
            if(!file.exists())
            {
                file.mkdirs();
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("postProcessAfterInitialization");
        return bean;
    }

    @Override
    public int getOrder()
    {
        return 0;
    }
}
