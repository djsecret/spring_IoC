package com.neu.custom_editor;

import java.beans.PropertyEditorSupport;

/**
 * 自定义User转换器
 * Created by ubuntu on 14-11-13.
 */
public class UserEditor extends PropertyEditorSupport
{
    /**
     * 将User对象转换为字符串
     * @return
     */
    @Override
    public String getAsText()
    {
        User user = (User)getValue();//通过getValue()获取当前对象
        return user.getClass().getName() + "," + user.getName() + "," + user.getAge();
    }

    /**
     * 将字符串转换为User对象
     * @param text
     * @throws IllegalArgumentException
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException
    {
        String splits[] = text.split(",");
        try
        {
            User user = (User)Class.forName(splits[0]).newInstance();
            user.setName(splits[1]);
            user.setAge(Integer.parseInt(splits[2]));
            setValue(user);//通过setValue设置当前对象
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
