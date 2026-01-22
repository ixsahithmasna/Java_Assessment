// Static, Multiple Objects & Mini Scenario
// Problem Statement
// Create a class Employee with:
// Fields:
// id, name, monthlySalary
// Static field:
// companyName
// Constructor
// Method:
// calculateAnnualSalary()
// Method:
// displayEmployeeDetails()
// Create at least 2 Employee objects and print their details.
// Must Use
// ✔ static keyword
// ✔ Constructors
// ✔ Multiple objects
// ✔ Methods
// ✔ OOP structure




class Employee{
    private  int id;
    private  String name;
    private  int monthlySalary;
    private static String companyName;
    Employee(int id,String name,int monthlySalary,String companyName){
        this.id = id;
        this.name = name;
        this.monthlySalary=monthlySalary;
        this.companyName=companyName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public static String getCompanyName() {
        return companyName;
    }
    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }
    public void calculateAnnualSalary(){
        System.out.println("Annual Income "+12*monthlySalary);
    }
    public  void displayEmployeeDetails(){
        System.out.println(id+" "+name+" "+monthlySalary+" "+companyName);
    }
    
}
public class problem5 {
    public static void main(String[] args){
        Employee e1 = new Employee(1,"sahith",10000,"Innovatech");
        e1.displayEmployeeDetails();
        e1.calculateAnnualSalary();
        Employee e2 = new Employee(2,"preetam", 10000, "Innovatech");
        e2.displayEmployeeDetails();
        e2.calculateAnnualSalary();
        Employee e3 = new Employee(3, "sujith", 10000,"Innovatech");
        e3.displayEmployeeDetails();
        e3.calculateAnnualSalary();
    }
}
