package com.hr.personnel.client;

import com.hr.personnel.Employee;
import java.time.LocalDate;

public class HRClient {

  public static void main(String[] args) {
    Employee employee1 = new Employee();
    employee1.setName("Sang");
    employee1.setHireDate(LocalDate.of(2020, 3, 10));
    String employeeInfo1 = employee1.getEmployeeInfo();
    System.out.println("employee info = " + employeeInfo1);

    Employee employee2 = new Employee("Mary", LocalDate.of(1900, 03, 05));
    String employeeInfo2 = employee2.getEmployeeInfo();
    System.out.println("employee info = " + employeeInfo2);
  }

}
