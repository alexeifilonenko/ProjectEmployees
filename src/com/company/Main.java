package com.company;

import com.company.kinomo.management.Manager;
import com.company.kinomo.staff.Employee;

public class Main {

    public static void main(String[] args) {
        Employee theFirst = new Employee("Ivan", "Ivanov", 001, 2000, "developer", "middle");       // создаем объекты работник (экземпляры класса)
        Employee theSecond = new Employee("Petr", "Petrov", 002, 600, "developer", "junior");
        Employee theThird = new Employee("Alex", "Sidorov", 003, 2200, "tester", "senior");
        Employee theFouth = new Employee("Bob", "Brown", 004, 3000, "developer", "lead");
        Employee theFifth = new Employee("Jonh", "Fox", 005, 1300, "manager", "senior");
        Employee theSixth = new Employee("Georg", "Wash", 006, 600, "tester", "junior");



        Manager manager = new Manager(theFifth);

        manager.addEmployee(theFirst, 0);       // добавляем каждого сотрудника в массив
        manager.addEmployee(theSecond, 1);
        manager.addEmployee(theThird, 2);
        manager.addEmployee(theFouth, 3);
        manager.addEmployee(theFifth, 4);
        manager.addEmployee(theSixth, 5);


        // поднимаем зп работникам
        //manager.upSalary();
        //System.out.println(manager.getEmployee(0).getSalary());
        //System.out.println(manager.getEmployee(1).getSalary());
        //System.out.println(manager.getEmployee(2).getSalary());
        //System.out.println(manager.getEmployee(3).getSalary());
       // System.out.println(manager.getEmployee(4).getSalary());
       // System.out.println(manager.getEmployee(5).getSalary());

        // выводим список работников, у которых jobPosition соответсвует введенной
       //manager.toShowEmployee("tester");

        //выводим список сотрудников, зп которых находится в диапазоне

        manager.showMinMaxSalary(1000, 2100);


        //System.out.println(manager.getEmployee(0).getJobPosition()); //для сотрудника с индексом 0 получили значение имени








    }
}
