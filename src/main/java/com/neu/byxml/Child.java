package com.neu.byxml;

/**
 * Created by ubuntu on 14-11-8.
 */
public class Child
{
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
