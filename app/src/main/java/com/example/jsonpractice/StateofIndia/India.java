package com.example.jsonpractice.StateofIndia;

public class India {

    String City,State,District;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    @Override
    public String toString() {
        return "India{" +
                "City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", District='" + District + '\'' +
                '}';
    }
}
