package com.neu.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 事件发布者，通过实现ApplicationEventPublisherAware接口，获得ApplicationEventPublisher对象
 * 进而调用publishEvent方法来发布事件
 * Created by ubuntu on 14-11-13.
 */
@Component
public class Publisher implements ApplicationEventPublisherAware
{
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher)
    {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publish()
    {
        TestEvent event = new TestEvent(this,"zhangsan",new Date());
        applicationEventPublisher.publishEvent(event);
    }
}
