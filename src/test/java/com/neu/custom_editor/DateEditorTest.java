package com.neu.custom_editor;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;

@ContextConfiguration(locations = {"/custom_editor.xml"})
public class DateEditorTest extends AbstractTestNGSpringContextTests
{
    @Resource
    private DateEditorDemo dateEditorDemo;

    @Resource
    private UserEditorDemo userEditorDemo;

    @Test
    public void testDate()
    {
        System.out.println(dateEditorDemo.getTime());
        System.out.println(userEditorDemo.getUser());
    }
}