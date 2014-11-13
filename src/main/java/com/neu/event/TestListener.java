package com.neu.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听者，实现ApplicationListener接口，重写onApplicationEvent方法
 * 这个方法会接收所有的事件，需要对指定类型的事件进行处理
 * Created by ubuntu on 14-11-13.
 */
@Component
public class TestListener implements ApplicationListener
{

    @Override
    public void onApplicationEvent(ApplicationEvent event)
    {
        //System.out.println(event.getSource());
        if(event instanceof TestEvent)
        {
            System.out.println("TestEvent" + event);
        }
    }
}
