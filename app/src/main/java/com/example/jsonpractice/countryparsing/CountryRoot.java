package com.example.jsonpractice.countryparsing;

import java.util.List;

public class CountryRoot {
    private int code;
    List<Country> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Country> getResult() {
        return result;
    }

    public void setResult(List<Country> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CountryRoot{" +
                "code=" + code +
                ", result=" + result +
                '}';
    }
}
