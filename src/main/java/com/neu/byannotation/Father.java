package com.neu.byannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ubuntu on 14-11-8.
 */
@Component
public class Father
{
    @Value("father")
    private String name;

    @Override
    public String toString()
    {
        return "Father{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
