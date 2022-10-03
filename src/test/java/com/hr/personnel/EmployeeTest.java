package com.hr.personnel;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
  private Employee employee;
  @Before
  public void setUp() {
    employee = new Employee("Sang", LocalDate.of(2020, 01, 03));

  }


  @Test
  public void getEmployeeInfo_should_return_name_and_hireDate(){
    String employeeInfo = employee.getEmployeeInfo();
    Assert.assertEquals("name = Sagn, hireDate = 2020-01-03", employeeInfo);
    assertThat(employeeInfo).isEqualTo("name =")
  }
  @Test
  public void getEmployee

}