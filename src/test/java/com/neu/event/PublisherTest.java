package com.neu.event;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;

@ContextConfiguration(locations = {"/event.xml"})
public class PublisherTest extends AbstractTestNGSpringContextTests
{

    @Resource
    private Publisher publisher;
    @Test
    public void testPublish() throws Exception
    {
        publisher.publish();
    }
}