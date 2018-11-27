package com.company;

import com.company.kinomo.management.Manager;
import com.company.kinomo.staff.Employee;

public class Main {

    public static void main(String[] args) {
        Employee theFirst = new Employee("Ivan", "Ivanov", 001, 2000, "developer", "middle");
        Employee theSecond = new Employee("Petr", "Petrov", 002, 600, "developer", "junior");
        Employee theThird = new Employee("Alex", "Sidorov", 003, 2200, "tester", "senior");
        Employee theFouth = new Employee("Bob", "Brown", 004, 3000, "developer", "lead");
        Employee theFifth = new Employee("Jonh", "Fox", 005, 1300, "manager", "senior");
        Employee theSixth = new Employee("Georg", "Wash", 006, 600, "tester", "junior");


        theFirst.toTellAboutYourself();

        Manager manager2 = new Manager(theFirst);
        manager2.printEmployee();



        Manager manager = new Manager("Bill", "Gates");
        //manager.toPromote(theFifth);
        System.out.println(theFifth.getSkill());
       // manager.toPromote(theFouth);
        System.out.println(theFouth.getSkill());
        manager.toUpSalary(theSecond);
        System.out.println(theSecond.getSalary());
        manager.toUpSalary(theFifth);
        manager.toUpSalary(theFirst);
        System.out.println(theFirst.getSalary());
        System.out.println(theFifth.getSalary());





        //System.out.println(theFirst.getFirstName());
       // System.out.println(theFifth.getFirstName());

       // System.out.println(theThird.getSalary());

       // theFirst.numberOfEmployee();
       // theSecond.numberOfEmployee();

        //theFirst.toTellAboutYourself();
        //theSecond.toTellAboutYourself();

    }
}
