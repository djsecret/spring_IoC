package com.neu.lifecycle;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 引用外部资源，可以实现ResourceLoaderAware接口，获得ResourceLoader
 * Created by ubuntu on 14-11-10.
 */
public class BannerLoader implements ResourceLoaderAware
{
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader)
    {
        this.resourceLoader = resourceLoader;
    }

    public void showBanner() throws IOException
    {
        Resource banner = resourceLoader.getResource("file:banner.txt");
        InputStream is = banner.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        while((line = reader.readLine()) != null)
        {
            System.out.println(line);
        }
    }
}
