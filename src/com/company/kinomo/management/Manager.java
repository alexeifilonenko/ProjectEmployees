package com.company.kinomo.management;

import com.company.kinomo.model.Employee;

public class Manager {
    private Employee employee;

    public Manager(Employee employee) {
        this.employee = employee;
    }

    public void printEmployeeName() {
        System.out.println("Name: " + employee.getFirstName());
    }




    }



