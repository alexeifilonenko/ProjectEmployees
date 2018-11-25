package com.company.kinomo.model;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;                         // класс "работник"
    private int salary;
    private String jobPosition;
    private String skill;

    public void toTellAboutYourself() {
        System.out.println("My name is " + firstName + ". " + "I'm a " + skill + " " + jobPosition);    // метод раюотника - представиться
    }

    public Employee(String ivan) {          // конструктор 1

    }

    public Employee(int id) {
        this.id = id;
    }   // контструктор 2

    public Employee(String firstName, String lastName, int id, int salary, String jobPosition, String skill) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;                           // контсруктор 3
        this.salary = salary;
        this.jobPosition = jobPosition;
        this.skill = skill;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }

    public void setNewSkillsAndMewSalary(String newSkills, int newSalary) {
        skill = newSkills;
        salary = newSalary;
    }
}
