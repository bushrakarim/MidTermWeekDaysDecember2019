package design;

public class NewEmployee extends EmployeeInfo {
    // Multi Level Inheritance....
    //constructor , super is to call from parent class
    public NewEmployee(int employeeID, String name, int age,double salary) {
        super(employeeID, name, age,salary);
    }
    @Override
    public void getDeptName(){
        System.out.println("New Employees dept is marketing..... ");
    }
    @Override
    public void getEmpAddress(){
        System.out.println("All Employees resides in Jersy city.....");
    }
    public void getEmailaddress(){
        System.out.println(("Employees email address must be registered....."));
    }

}
