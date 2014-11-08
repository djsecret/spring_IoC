package com.neu.byxml;

/**
 * Created by ubuntu on 14-11-8.
 */
public class Father
{
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
