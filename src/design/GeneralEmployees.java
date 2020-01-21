package design;

public abstract class GeneralEmployees {
    private int employeeID;
    private String name;
    private int age;
    public double salary;
     //constructor.....
    GeneralEmployees(){}
     GeneralEmployees(int employeeId, String name, int age, double salary ) {
        this.employeeID = employeeId;
        this.name = name;
        this.age = age;
        this.salary=salary;
    }
    //non abstract method...
    public void napTime() {
        System.out.println("Employee should get nap time to perform better...");
    }

    public void breakTime() {
        System.out.println("Employees get thirty minutes paid break  to eat lunch ");

    }
    //abstract method .......
    public abstract  void freeRide();

}
