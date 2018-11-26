package com.company.kinomo.management;

import com.company.kinomo.staff.Employee;

public class Manager {
    private String firstName;
    private String lastName;

    public Manager(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee promote(Employee employee) {
        String skill =  employee.getSkill();
        if(skill.equals("junior")) {
            employee.setSkill("middle");
        }else if(skill.equals("middle")) {
            employee.setSkill("senior");
        }else if(skill.equals("senior")) {
            employee.setSkill("lead");
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









