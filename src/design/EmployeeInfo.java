package design;

import java.util.Scanner;

import static design.Months.valueOf;

public class EmployeeInfo extends GeneralEmployees implements Employee {
    //Single level inheritance....

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     *
     */
    static String companyName;
    public String deptName;
	public static double salary;
	private int performance;
    static String address;

    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     * ------------------------------------------------------------------------------
     */
    // constructor using super keyword, to have call from the parents

    public EmployeeInfo(int employeeID, String name, int age,double salary) {
        super(employeeID, name, age,salary);
    }
    public EmployeeInfo (String companyName){
        this.companyName = companyName;
        System.out.println(companyName);
    }
    //implementing Interface methods...
    public int employeeId() {
        System.out.println("Every employees should have unique employee ID....");
       return 0;
    }
    public String employeeName(){
        return null;
    }
    public double calculateSalary() {
        salary=salary*12;
        return salary;
    }


    public void benefitLayout() {
        System.out.println("Your salary is :::" + calculateSalary());
    }


    public void assignDepartment() {

    }
    // concrete class's own method... which is overriding in its child class "NewEmployee"
	public void getDeptName(){
        System.out.println("Department name is : Developers Department....");
    }
    public void getEmpAddress(){
        System.out.println("All Employees resides in NewYork city.....");
    }

    //Abstract method of abstract class "GeneralEmployee"...
	public void freeRide() {
        System.out.println("Employee should be picked up and dropped back  by company car..");
    }
    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public static double calculateEmployeeBonus( int performance, double salary) {
        double total = 0;
        if (performance == 1) {
            total = .1 * salary;
        } else if (performance == 2) {
            total = .08 * salary;
        } else {
            total = .05 * salary;
        }
        System.out.println("employee bonus = $ " + total);
        return total;
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static double calculateEmployeePension(double salary) {
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: MAY,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: AUGUST,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
        //Calculate pension

		String current_year = convertedTodaysDate.substring(convertedTodaysDate.length()-4);
		String start_year = convertedJoiningDate.substring(convertedJoiningDate.length()-4);

		// convert String method to integer to get number of years (in integer)...
		int currentYear = Integer.parseInt(current_year);
		int startYear = Integer.parseInt(start_year);
		if((currentYear - startYear)==1) {
			total= salary*.05;
		} else if ((currentYear - startYear)==2){
			total = salary*.1;
		} else {
			total = salary*.2;
		}
		System.out.println("Employee pension is = $ "+ total);
		return total;
    }
    private static class DateConversion {

        public DateConversion(Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String GIVENMONTH) {
			Months months = Months.valueOf(GIVENMONTH);
			int date = 0;
            switch (months) {
                case JANUARY:
                    date = 1;
                    break;
                case FEBRUARY:
                    date = 2;
                    break;
                case MARCH:
                    date = 3;
                    break;
                case APRIL:
                    date = 4;
                    break;
                case MAY:
                    date = 5;
                    break;
                case JUNE:
                    date = 6;
                    break;
                case JULY:
                    date = 7;
                    break;
                case AUGUST:
                    date = 8;
                    break;
                case SEPTEMBER:
                    date = 9;
                    break;
                case OCTOBER:
                    date = 10;
                    break;
                case NOVEMBER:
                    date = 11;
                    break;
                case DECEMBER:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
