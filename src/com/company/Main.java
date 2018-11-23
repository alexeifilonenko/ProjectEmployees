package com.company;

import com.company.kinomo.model.Employee;

public class Main {

    public static void main(String[] args) {
        Employee theFirst = new Employee("Ivan", "Ivanov", 001, 2000, "developer", "middle");
        Employee theSecond = new Employee("Petr", "Petrov", 002, 600, "developer", "junior");
        Employee theThird = new Employee("Alex", "Sidorov", 003, 2200, "tester", "senior");
        Employee theFouth = new Employee("Bob", "Brown", 004, 3000, "developer", "lead");

    }
}
