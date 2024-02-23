//package Assignment_8.Fifth;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//@FunctionalInterface
//interface Employeefilter{
//    boolean filter(EmployeeDataManagement data);
//
////    boolean filter(Employee emp);
//}
//abstract class DepartmentFilter implements Employeefilter {
//    private String department;
//
//    public DepartmentFilter(String department) {
//        this.department = department;
//    }
//
//    @Override
//    public boolean filter(EmployeeDataManagement emp) {
//        return emp.getDepartment().equals(department);
//    }
//}
//
//public class FifthOne {
//    public static void main(String[] args) {
//        Employeefilter filterDept = new Employeefilter() {
//            @Override
//            public boolean filter(EmployeeDataManagement data) {
//                if(!data.getEmployeeDataManagement().isEmpty()) {
//                    System.out.println(data.getEmployeeDataManagement().stream().map(x->x.getDept()).distinct().collect(Collectors.toList()));
//                    return true;
//                }
//                else {
//                    System.out.println("No employee found!!");
//                }
//                return false;
//            }
//        };
//
//        EmployeeDataManagement data = new EmployeeDataManagement();
//        data.addEmployee(new Employee("John", "IT", 50000, 3));
//        data.addEmployee(new Employee("Alice", "HR", 60000, 5));
//        data.addEmployee(new Employee("Bob", "Finance", 70000, 8));
//        data.addEmployee(new Employee("David", "IT", 55000, 4));
//        data.addEmployee(new Employee("Emily", "Finance", 65000, 6));
//        data.calculateAvgSalary();
//        data.findEmployeeByName("Tufail");
//        filterDept.filter(data);
//    }
//}
//class Employee{
//    String name;
//    String dept;
//    int salary;
//    int exp;
//    Employee(String name, String dept,int salary,int exp){
//        this.name = name;
//        this.dept = dept;
//        this.salary = salary;
//        this.exp = exp;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public String getDept() {
//        return dept;
//    }
//
//    public int getExp() {
//        return exp;
//    }
//    public int getSalary() {
//        return salary;
//    }
//}
//class EmployeeDataManagement {
//    private final List<Employee> employee;
//    public EmployeeDataManagement() {
//        employee = new ArrayList<>();
//    }
//    public List<Employee> getEmployeeDataManagement(){
//        return employee;
//    }
//    public void addEmployee(Employee emp) {
//        employee.add(emp);
//    }
//    public void calculateAvgSalary(){
//        System.out.println(employee.stream().mapToInt(Employee::getSalary).average().getAsDouble());
//    }
//    public List<Employee> findEmployeeByName(String name){
//      return employee.stream().filter(emp -> name.equalsIgnoreCase(emp.getName())).toList();
//    }
//
//}
//
//
