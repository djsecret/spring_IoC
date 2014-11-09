package com.neu.spel.collectionOpts;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionOptsTest
{
    @Test
    public void testCollection()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spel.xml");
        CollectionOpts collectionOpts = (CollectionOpts)context.getBean("collectionOpts");
        System.out.println(collectionOpts.getCities());
        System.out.println(collectionOpts.getChicago());
        System.out.println(collectionOpts.getRandomCity());
        System.out.println(collectionOpts.getJavaHome());
        System.out.println(collectionOpts.getBigCities());
        System.out.println(collectionOpts.getFirstBigCity());
        System.out.println(collectionOpts.getLastBigCity());
        System.out.println(collectionOpts.getCityNames());
        System.out.println(collectionOpts.getCityNameStates());
        System.out.println(collectionOpts.getBigCityNames());
    }

}