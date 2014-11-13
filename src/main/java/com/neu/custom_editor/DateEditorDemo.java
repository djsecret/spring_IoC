package com.neu.custom_editor;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by ubuntu on 14-11-13.
 */
@Component
public class DateEditorDemo
{
    @Value("2010-1-1")
    private Date time;

    public Date getTime()
    {
        return time;
    }
}
