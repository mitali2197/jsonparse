package com.example.jsonpractice.employeeDetails;

import java.util.List;

public class EmployeeRespo {
    private String status;
    private List<EmployeeRoot> data;

    @Override
    public String toString() {
        return "EmployeeRespo{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<EmployeeRoot> getData() {
        return data;
    }

    public void setData(List<EmployeeRoot> data) {
        this.data = data;
    }
}
