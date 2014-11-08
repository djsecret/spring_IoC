package com.neu.byannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 使用注解的方式装配bean
 * Created by ubuntu on 14-11-8.
 */
@Component
public class User
{
    @Value("user")
    private String username;

    @Value("12")
    private int age;

    @Autowired
    private Father father;

    //集合类的容器在注入值时，会根据类型来判断，将满足内容类型的bean放到容器当中，注意，不管是xml配置的还是注解配置的，都会放入
    @Autowired
    private List<String> songList;

    @Autowired
    private Set<Child> children;

    @Autowired
    private Map<String,Integer> score;

    @Override
    public String toString()
    {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", father=" + father +
                ", songList=" + songList +
                ", children=" + children +
                ", score=" + score +
                '}';
    }
}
