package com.company.kinomo.management;

import com.company.kinomo.staff.Employee;

public class Manager {          // создаем класс Manager


    private Employee employee;  // к классе Manager создаем приватную переменную типа Employee (она будет ссылаться на объект)

    private Employee[] employeeArr = new Employee[6];    //создали массив employeeArr

    public void addEmployee(Employee employee, int index) { //создали метод, который добавляет employee в массив
        this.employeeArr[index] = employee;
    }

    public Employee getEmployee(int index) {            // создали метод, который получает сотрудника из массива по идексу
        return employeeArr[index];
    }

    //метод, который в зависимости от значения поля jobPosition установит все сотрудникам новое значение з/п

   public Employee[] upSalary() {

       for (int i = 0; i < employeeArr.length; i++) {

           Employee currentEmployee = employeeArr[i]; // getEmployee(i);

           String jobPosition = currentEmployee.getJobPosition();           //взяли значение поля jobPosition

           if ("developer".equals(jobPosition)) {
               currentEmployee.setSalary(777);
           } else if ("tester".equals(jobPosition)) {
               currentEmployee.setSalary(888);
           } else if ("manager".equals(jobPosition)) {
               currentEmployee.setSalary(999);
           }

       } return employeeArr;
   }

   //метод, в который передается jobPosition сотрудника и выводятся всех сотрудников, которые соответствуют данной позиции

   public void toShowEmployee(String jobPosition) {
       for (int i = 0; i < employeeArr.length; i++) {
           Employee currentEmployee = employeeArr[i];
           String jobPosition1 = currentEmployee.getJobPosition();

           if (jobPosition.equals(jobPosition1)) {
               System.out.println(currentEmployee.getFirstName() + " " + currentEmployee.getLastName());
           }
       }
   }

   //метод, в который передается min и max зарплата работника и метод возвразает список подходящих сотрудников

    public void showMinMaxSalary(int minSalary, int maxSalary) {
        for (int i = 0; i < employeeArr.length; i++) {
            Employee currentEmployee = employeeArr[i];
            int currentSalary = currentEmployee.getSalary();  //говорим, что зп выбранного работника является минимальной
            if (minSalary < currentSalary && currentSalary < maxSalary) {
                System.out.println(currentEmployee.getFirstName() + " " + currentEmployee.getLastName() + " " +currentEmployee.getSalary());
            }

            }


    }

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









