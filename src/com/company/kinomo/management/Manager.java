package com.company.kinomo.management;

import com.company.kinomo.staff.Employee;

public class Manager {          // создаем класс Manager


    private Employee employee;  // к классе Manager создаем приватную переменную типа Employee (она будет ссылаться на объект)



    public Manager(Employee employee) { // создаем конструктор Manager
        this.employee = employee;
    }
    public void printEmployee() {       // метод, котрый будет выводить данные работника
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getJobPosition());
    }

    public Employee toPromote(Employee employee) {
        String skill =  employee.getSkill();
        if("junior".equals(skill)) {
            "middle".equals(skill);            //метод работника: "Повышение"
        }else if("middle".equals(skill)) {
            "senior".equals(skill);
        }else if("senior".equals(skill)) {
            "lead".equals(skill);
        }else if ("lead".equals(skill)) {
            "manager".equals(skill);
        }

        return employee;
    }

    public Employee toUpSalary(Employee employee) {
        int salary = employee.getSalary();
        if(salary < 800) {                                      // метод работника: "Поднять з/п"
            employee.setSalary(employee.getSalary() + 200);
        }else if(salary < 1400 && salary > 801) {
            employee.setSalary(employee.getSalary() +300);
        }else if(salary < 2100 && salary > 1401) {
            employee.setSalary(employee.getSalary() + 250);
        }
        return employee;
    }


}









