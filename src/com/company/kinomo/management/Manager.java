package com.company.kinomo.management;

import com.company.kinomo.staff.Employee;

public class Manager {
    private String firstName;                           //класс Manager
    private String lastName;
    private Employee employee;

    public Manager(String firstName, String lastName) {
        this.firstName = firstName;                     //конструктор Manager
        this.lastName = lastName;
    }

    public Manager(Employee employee) {
        this.employee = employee;
    }
    public void printEmployee() {
        System.out.println(employee.getFirstName() + employee.getLastName());
    }

    public Employee toPromote() {
        String skill =  employee.getSkill();
        if(skill.equals("junior")) {
            employee.setSkill("middle");            //метод "Повышение"
        }else if(skill.equals("middle")) {
            employee.setSkill("senior");
        }else if(skill.equals("senior")) {
            employee.setSkill("lead");
        }else if (skill.equals("lead")) {
            employee.setSkill("manager");
        }

        //if ("juhdgfh".equals(skill) )
        return employee;
    }

    public Employee toUpSalary(Employee employee) {
        int salary = employee.getSalary();
        if(salary < 800) {                                      //метод "Поднять з/п"
            employee.setSalary(employee.getSalary() + 200);
        }else if(salary < 1400 && salary > 801) {
            employee.setSalary(employee.getSalary() +300);
        }else if(salary < 2100 && salary > 1401) {
            employee.setSalary(employee.getSalary() + 250);
        }
        return employee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}









