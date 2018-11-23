package com.company.kinomo.model;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private int salary;
    private String jobPosition;
    private String skill;

    public Employee(String ivan) {

    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String firstName, String lastName, int id, int salary, String jobPosition, String skill) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
        this.jobPosition = jobPosition;
        this.skill = skill;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
