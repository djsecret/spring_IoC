package com.neu.custom_editor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ubuntu on 14-11-13.
 */
@Component
public class UserEditorDemo
{
    @Value("com.neu.custom_editor.User,zhangsan,12")
    private User user;

    public User getUser()
    {
        return user;
    }
}
