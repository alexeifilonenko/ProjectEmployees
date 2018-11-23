package com.company.kinomo.model;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private int salary;
    private String jobPosition;

    public Employee(String ivan) {

    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String firstName, String lastName, int id, int salary, String jobPosition) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
        this.jobPosition = jobPosition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
