package com.neu.spel.collectionOpts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * SpEL的集合操作示例
 * Created by ubuntu on 14-11-9.
 */
@Component
public class CollectionOpts
{
    @Value("#{cities}")
    private List<City> cities;
    //访问集合元素
    @Value("#{cities[0]}")
    private City Chicago;

    @Value("#{cities[T(java.lang.Math).random() * cities.size()]}")
    private City randomCity;

    @Value("#{systemEnvironment['JRE_HOME']}")
    private String javaHome;

    //查询集合成员

    //查询运算符，得到所有满足查询条件的项的集合（,?[]）
    @Value("#{cities.?[population gt 1000]}")
    private List<City> bigCities;
    //从集合中查询出的第一个匹配项（.^[]）
    @Value("#{cities.^[population gt 1000]}")
    private City firstBigCity;
    //从集合中查询出的最后一个匹配项（.$[]）
    @Value("#{cities.$[population gt 1000]}")
    private City lastBigCity;

    //投影集合
    //投影单列
    @Value("#{cities.![name]}")
    private List<String> cityNames;
    //投影多列
    @Value("#{cities.![name + ',' + state]}")
    private List<String> cityNameStates;

    //结合使用查询和投影
    @Value("#{cities.?[population gt 1000].![name]}")
    private List<String> bigCityNames;

    public List<String> getBigCityNames()
    {
        return bigCityNames;
    }

    public void setBigCityNames(List<String> bigCityNames)
    {
        this.bigCityNames = bigCityNames;
    }

    public List<String> getCityNameStates()
    {
        return cityNameStates;
    }

    public void setCityNameStates(List<String> cityNameStates)
    {
        this.cityNameStates = cityNameStates;
    }

    public List<String> getCityNames()
    {
        return cityNames;
    }

    public void setCityNames(List<String> cityNames)
    {
        this.cityNames = cityNames;
    }

    public City getFirstBigCity()
    {
        return firstBigCity;
    }

    public void setFirstBigCity(City firstBigCity)
    {
        this.firstBigCity = firstBigCity;
    }

    public City getLastBigCity()
    {
        return lastBigCity;
    }

    public void setLastBigCity(City lastBigCity)
    {
        this.lastBigCity = lastBigCity;
    }

    public List<City> getBigCities()
    {
        return bigCities;
    }

    public void setBigCities(List<City> bigCities)
    {
        this.bigCities = bigCities;
    }

    public String getJavaHome()
    {
        return javaHome;
    }

    public void setJavaHome(String javaHome)
    {
        this.javaHome = javaHome;
    }

    public City getRandomCity()
    {
        return randomCity;
    }

    public void setRandomCity(City randomCity)
    {
        this.randomCity = randomCity;
    }

    public City getChicago()
    {
        return Chicago;
    }

    public void setChicago(City chicago)
    {
        Chicago = chicago;
    }

    public List<City> getCities()
    {
        return cities;
    }

    public void setCities(List<City> cities)
    {
        this.cities = cities;
    }
}
