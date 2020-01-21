package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
       // Assert.assertEquals(EmployeeInfo.calculateEmployeeBonus(1);
      Assert.assertEquals(EmployeeInfo.calculateEmployeeBonus(2,1000.0),80.0);
        Assert.assertEquals(EmployeeInfo.calculateEmployeePension(1000.0),200.0);
    }
}
