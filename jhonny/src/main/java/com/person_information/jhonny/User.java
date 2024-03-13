package com.person_information.jhonny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Id
    @Column(name = "user_name",nullable = false)
    private String userName;
    @Column(name = "age")
    public int age;
    @Column(name = "mobile_number")
    public long mobileNumber;
    @Column(name = "UserName")
    public String city;

    public User(String name,int age, long mobileNumber,String city)
    {
        this.userName = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.city = city;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
