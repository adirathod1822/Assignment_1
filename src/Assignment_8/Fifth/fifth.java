package Assignment_8.Fifth;

import java.util.*;

@FunctionalInterface
interface EmployeeFilter{
    boolean filter(Employee emp);
}

class DepartmentFilter implements EmployeeFilter{
    String Department;
    DepartmentFilter(String Department){
        this.Department=Department;
        }
    @Override
    public boolean filter(Employee emp) {
        return emp.getDepartment().equals(Department);
    }
}class SalaryFilter implements EmployeeFilter{
    private double minSalary;
    private double maxSalary;

    public SalaryFilter(double minSalary, double maxSalary) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }
    @Override
    public boolean filter(Employee emp) {
        return emp.getSalary()>=minSalary && emp.getSalary()<=maxSalary;
    }
}
class ExperienceFilter implements EmployeeFilter{
    int Experience;
    ExperienceFilter(int Experience){
        this.Experience=Experience;
        }
    @Override
    public boolean filter(Employee emp) {
        return emp.getExperience()>=Experience;
    }
}

class EmployeeDataManagement {
    private final List<Employee> employee;
    public EmployeeDataManagement() {
        employee = new ArrayList<>();
    }
    public List<Employee> getEmployeeDataManagement(){
        return employee;
    }
    public void addEmployee(Employee emp) {
        employee.add(emp);
    }
    public void calculateAvgSalary(){
        System.out.println(employee.stream().mapToInt(Employee::getSalary).average().getAsDouble());
    }
    public List<Employee> findEmployeeByName(String name){
      return employee.stream().filter(emp -> name.equalsIgnoreCase(emp.getName())).toList();
    }
    public static void printFilteredEmployeeDetails(EmployeeDataManagement employees, EmployeeFilter filter){
        for(Employee e :employees.getEmployeeDataManagement()){
            if(filter.filter(e)){
                System.out.print("Name: "+e.getName()+", ");
                System.out.print("Department: "+e.getDepartment()+", ");
                System.out.print("Salary: " + e.getSalary()+", ");
                System.out.println("Experience: "+ e.getExperience() + ".");
            }
        }
    }

}

class Employee{
    String name;
    String Department;
    int Salary;
    int Experience;

     Employee(String name,String Department,int Salary,int Experience){
        this.name = name;
        this.Department = Department;
        this.Salary = Salary;
        this.Experience = Experience;
    }

    public String getName(){
        return name;
    }
    public String getDepartment(){
        return Department;
    }
    public int getSalary(){
        return Salary;
    }
    public int getExperience(){
        return Experience;
    }
    public void employeeDetails(){
        System.out.print("Name: "+this.getName()+", ");
        System.out.print("Department: "+this.getDepartment()+", ");
        System.out.print("Salary: " + this.getSalary()+", ");
        System.out.println("Experience: "+ this.getExperience() + ".");
    }
}

public class fifth {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        EmployeeDataManagement employees = new EmployeeDataManagement();
        employees.addEmployee(new Employee("Aditya", "IT", 1000000,5));
        employees.addEmployee(new Employee("Maan", "IT", 1000000,5));
        employees.addEmployee(new Employee("Jay", "HR", 10000,3));
        employees.addEmployee(new Employee("Tufail", "R&D", 2000000,9));

        System.out.println("Employess Data: ");
        System.out.println("-----------------------------------------------------------");
        employees.getEmployeeDataManagement().forEach(Employee::employeeDetails);
        System.out.println("-----------------------------------------------------------\n");

        System.out.println("Filters: \n 1.Filter by Department \n 2.Filter by Salary \n 3.Filter by Expereience \n 4.Exit");
        while (true){
            System.out.print("Enter filter option: ");
            int option = ip.nextInt();
            if(option==1){
                System.out.print("Department Filter by: ");
                String Department = ip.next();
                employees.printFilteredEmployeeDetails(employees,new DepartmentFilter(Department));
            }
            else if(option==2){
                System.out.println("Salary Filter by: ");
                System.out.print("Salary Minimum Range: ");
                int minSalary= ip.nextInt();
                System.out.print("Salary Minimum Range: ");
                int maxSalary = ip.nextInt();
                System.out.println("Salary Filter in Range of " +minSalary+ " and "+maxSalary);
                employees.printFilteredEmployeeDetails(employees,new SalaryFilter(minSalary,maxSalary));
            }
            else if(option==3){
                System.out.print("Years Filter by");
                int Expereience = ip.nextInt();
                System.out.println("Expereience of " +Expereience+ " or more "+ Expereience+"  than years ");
                employees.printFilteredEmployeeDetails(employees,new ExperienceFilter(Expereience));
            }
            else if(option==4) break;
        }
    }
}
