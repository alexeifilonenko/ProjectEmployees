package com.company.kinomo.model;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;                         // класс "работник"
    private int salary;
    private String jobPosition;
    private String skill;
    private static int countEmployee;

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
        countEmployee++;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void toTellAboutYourself() {
        System.out.println("My name is " + firstName + ". " + "I'm a " + skill + " " + jobPosition);    // метод работника - представиться
    }


    public void numberOfEmployee() {
        System.out.println("Number of employees in company " + countEmployee);
    }


    public void setNewSkillsAndNewSalary(String newSkills, int newSalary) {
        skill = newSkills;
        salary = newSalary;
    }
}
