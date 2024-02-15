package Assignment_5;
abstract class Employee{
    int employeeId;
    String employeeName;
    double monthlySalary;
    abstract double netSalary();
    abstract void display();
}
class Manager extends Employee{
    @Override
    double netSalary() {
        if(this.employeeId != 0 && this.employeeName != null)
        return this.monthlySalary*12;
        else System.out.println("Enter required detials ");
        return 0.0;

    }

    @Override
    void display() {
        if (this.employeeId!=0 && this.employeeName != null )
        System.out.println("Net Salary of "+ this.employeeName + " is "+this.netSalary());
        else System.out.println("Enter required detials ");
    }
}
class Clerk extends Employee{
    @Override
    double netSalary() {
        if(this.employeeId != 0 && this.employeeName != null)
        return this.monthlySalary*12;
        return 0.0;
    }

    @Override
    void display() {
        if (this.employeeId!=0 && this.employeeName != null )
        System.out.println("Net Salary of "+ this.employeeName + " is " +this.netSalary());
        else System.out.println("Enter required details!!");
    }
}
public class Second {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        c.employeeId = 33;
        c.employeeName = "Clerk Clerky";
        c.monthlySalary = 28000.00;

        c.display();

        Manager m = new Manager();
        m.employeeId = 44;
        m.employeeName = "Mani Manager";
        m.monthlySalary = 56000;
        m.display();
    }
}
