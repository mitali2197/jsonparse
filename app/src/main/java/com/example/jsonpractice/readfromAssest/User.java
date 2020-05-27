package com.example.jsonpractice.readfromAssest;

import java.util.ArrayList;

public class User {

    String name,age;
    ArrayList<String> messages;

    public User(String name, String age, ArrayList<String> messages) {
        this.name = name;
        this.age = age;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", messages=" + messages +
                '}';
    }
}
