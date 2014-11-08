package com.neu.byannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ubuntu on 14-11-8.
 */

@Component
public class Child
{
    @Value("child")
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Child{" +
                "name='" + name + '\'' +
                '}';
    }
}
