package com.neu.byxml;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 使用xml的方式配置bean
 * Created by ubuntu on 14-11-8.
 */
public class User
{
    private String username;
    private int age;
    private Father father;
    private List<String> songsList;
    private Set<Child> children;
    private Map<String,Integer> scores;


    @Override
    public String toString()
    {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", father=" + father +
                ", songsList=" + songsList +
                ", children=" + children +
                ", scores=" + scores +
                '}';
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Father getFather()
    {
        return father;
    }

    public void setFather(Father father)
    {
        this.father = father;
    }

    public List<String> getSongsList()
    {
        return songsList;
    }

    public void setSongsList(List<String> songsList)
    {
        this.songsList = songsList;
    }

    public Set<Child> getChildren()
    {
        return children;
    }

    public void setChildren(Set<Child> children)
    {
        this.children = children;
    }

    public Map<String, Integer> getScores()
    {
        return scores;
    }

    public void setScores(Map<String, Integer> scores)
    {
        this.scores = scores;
    }
}
