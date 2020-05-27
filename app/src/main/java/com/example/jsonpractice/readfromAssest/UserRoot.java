package com.example.jsonpractice.readfromAssest;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserRoot {
    @SerializedName("name")
    private final String name;

    @SerializedName("age")
    private final String age;

    @SerializedName("messages")
    private final List<String> messages;

    public UserRoot(String name, String age, List<String> messages) {
        this.name = name;
        this.age = age;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public List<String> getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return "UserRoot{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", messages=" + messages +
                '}';
    }
}
