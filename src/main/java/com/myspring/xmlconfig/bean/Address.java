package com.myspring.xmlconfig.bean;

/**
 * @ClassName Province
 * @Description TODO
 * @Author Cheng Liu
 * @Date 13/10/2022 9:34 PM
 */
public class Address {

    private String city;
    private String town;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Address() {
        System.out.println("Address被创建");
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}