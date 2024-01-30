package storage;

import java.util.Date;

public class User {
    private String name;
    private int age;
    private String address;
    private String picture;

    public User() {
    }

    public User(String name, int age, String address, String picture) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
