package com.neu.lifecycle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 引用外部资源，可以实现ResourceLoaderAware接口，获得ResourceLoader
 * Created by ubuntu on 14-11-10.
 */
@Component
public class BannerLoader implements ResourceLoaderAware
{
    private ResourceLoader resourceLoader;

    //使用注入的方式
    @Value("file:banner.txt")
    private Resource bannerResource;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader)
    {
        this.resourceLoader = resourceLoader;
    }

    @PostConstruct
    public void showBanner() throws IOException
    {
        //file:的相对路径是整个工程的根目录
//        Resource banner = resourceLoader.getResource("file:banner.txt");
//        InputStream is = banner.getInputStream();
        InputStream is = bannerResource.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        while((line = reader.readLine()) != null)
        {
            System.out.println(line);
        }
    }
}
