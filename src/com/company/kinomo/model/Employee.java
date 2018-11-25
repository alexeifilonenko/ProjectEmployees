package com.company.kinomo.model;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;                         // класс "работник"
    private int salary;
    private String jobPosition;
    private String skill;

    public void setFirstName(String userFirstName) {
        firstName = userFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String userLastName) {
        lastName = userLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int userId) {
        id = userId;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int userSalary) {
        salary = userSalary;
    }

    public int getSalary() {
        return salary;
    }

    public void setJobPosition(String userJobPosition) {
        jobPosition = userJobPosition;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setSkill(String userSkills) {
        skill = userSkills;
    }

    public String getSkill() {
        return skill;
    }

    public void toTellAboutYourself() {
        System.out.println("My name is " + firstName + ". " + "I'm a " + skill + " " + jobPosition);    // метод работника - представиться
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



    public void setNewSkillsAndMewSalary(String newSkills, int newSalary) {
        skill = newSkills;
        salary = newSalary;
    }
}
