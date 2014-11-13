package com.neu.event;

import org.springframework.context.ApplicationEvent;

import java.util.Date;

/**
 * 定义一个事件，必须继承ApplicationEvent，并且实现带super(source);的构造函数
 * Created by ubuntu on 14-11-13.
 */
public class TestEvent extends ApplicationEvent
{
    private String name;
    private Date time;

    public TestEvent(Object source, String name, Date time)
    {
        super(source);
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString()
    {
        return "TestEvent{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
