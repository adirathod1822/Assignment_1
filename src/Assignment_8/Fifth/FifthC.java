//package Assignment_8.Fifth;
//
//import java.util.ArrayList;
//import java.util.List;
//
//// Employee class representing an employee
//class Employee {
//    private String name;
//    private String department;
//    private double salary;
//    private int experienceYears;
//
//    public Employee(String name, String department, double salary, int experienceYears) {
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//        this.experienceYears = experienceYears;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public int getExperienceYears() {
//        return experienceYears;
//    }
//}
//
//// Functional interface for filtering employees
//interface EmployeeFilter {
//    boolean filter(Employee emp);
//}
//
//// Implementation of EmployeeFilter for filtering based on department
//class DepartmentFilter implements EmployeeFilter {
//    private String department;
//
//    public DepartmentFilter(String department) {
//        this.department = department;
//    }
//
//    @Override
//    public boolean filter(Employee emp) {
//        return emp.getDepartment().equals(department);
//    }
//}
//
//// Implementation of EmployeeFilter for filtering based on salary range
//class SalaryRangeFilter implements EmployeeFilter {
//    private double minSalary;
//    private double maxSalary;
//
//    public SalaryRangeFilter(double minSalary, double maxSalary) {
//        this.minSalary = minSalary;
//        this.maxSalary = maxSalary;
//    }
//
//    @Override
//    public boolean filter(Employee emp) {
//        return emp.getSalary() >= minSalary && emp.getSalary() <= maxSalary;
//    }
//}
//
//// Implementation of EmployeeFilter for filtering based on years of experience
//class ExperienceFilter implements EmployeeFilter {
//    private int minExperienceYears;
//
//    public ExperienceFilter(int minExperienceYears) {
//        this.minExperienceYears = minExperienceYears;
//    }
//
//    @Override
//    public boolean filter(Employee emp) {
//        return emp.getExperienceYears() >= minExperienceYears;
//    }
//}
//
//public class FifthC {
//    public static void main(String[] args) {
//        // Sample employee data
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("John", "IT", 50000, 3));
//        employees.add(new Employee("Alice", "HR", 60000, 5));
//        employees.add(new Employee("Bob", "Finance", 70000, 8));
//        employees.add(new Employee("David", "IT", 55000, 4));
//        employees.add(new Employee("Emily", "Finance", 65000, 6));
//
//        // Filter employees based on department
//        System.out.println("IT Department Employees:");
//        printFilteredEmployees(employees, new DepartmentFilter("IT"));
//
//        // Filter employees based on salary range
//        System.out.println("\nEmployees with Salary between $50,000 and $60,000:");
//        printFilteredEmployees(employees, new SalaryRangeFilter(50000, 60000));
//
//        // Filter employees based on years of experience
//        System.out.println("\nEmployees with 5 or more years of experience:");
//        printFilteredEmployees(employees, new ExperienceFilter(5));
//    }
//
//    // Method to print filtered employees
//    public static void printFilteredEmployees(List<Employee> employees, EmployeeFilter filter) {
//        for (Employee emp : employees) {
//            if (filter.filter(emp)) {
//                System.out.println(emp.getName() + " - Department: " + emp.getDepartment() + ", Salary: $" +
//                        emp.getSalary() + ", Experience: " + emp.getExperienceYears() + " years");
//            }
//        }
//    }
//}
