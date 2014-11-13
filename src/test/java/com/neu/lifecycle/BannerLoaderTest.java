package com.neu.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = {"/lifecycle.xml"})
public class BannerLoaderTest extends AbstractTestNGSpringContextTests
{
    @Autowired
    private BannerLoader bannerLoader;
    @Test
    public void testShowBanner() throws Exception
    {

    }
}