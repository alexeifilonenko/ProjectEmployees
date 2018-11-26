package com.company.kinomo.management;

import com.company.kinomo.staff.Employee;

public class Manager {
    private String firstName;
    private String lastName;

    public Manager(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee toPromote(Employee employee) {
        String skill =  employee.getSkill();
        if(skill.equals("junior")) {
            employee.setSkill("middle");
        }else if(skill.equals("middle")) {
            employee.setSkill("senior");
        }else if(skill.equals("senior")) {
            employee.setSkill("lead");
        }else if (skill.equals("lead")) {
            employee.setSkill("manager");
        }
        return employee;
    }

    public Employee toUpSalary(Employee employee) {
        int salary = employee.getSalary();
        if(salary < 800) {
            employee.setSalary(employee.getSalary() + 200);
        }else if(salary < 1400) {
            employee.setSalary(employee.getSalary() +300);
        }else if(salary < 2100) {
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









