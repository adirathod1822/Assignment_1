package Assignment_8.Fifth;

import java.util.*;
@FunctionalInterface
interface Employeefilter{
    boolean filter(EmployeeDataManagement data, String name);
}

public class FifthOne {
    public static void main(String[] args) {
        Employeefilter filterDeptA = new Employeefilter() {
            @Override
            public boolean filter(EmployeeDataManagement data,String name) {
                List<Employee> empData = data.findEmployeeByName(name);

                if(!empData.isEmpty()) {
                    if (data.findEmployeeByName(name).get(0).getDept() == "A") {
                        System.out.println("Name: "+ empData.stream().filter(emp -> name.equalsIgnoreCase(emp.getName())).toList().get(0).getName() );
                        System.out.println("Department: "+ empData.stream().filter(emp -> name.equalsIgnoreCase(emp.getName())).toList().get(0).getDept() );
                        System.out.println("Experience: "+ empData.stream().filter(emp -> name.equalsIgnoreCase(emp.getName())).toList().get(0).getExp() + " years");

                        return true;
                    }
                }
                else {
                    System.out.println("No employee found!!");
                }
                return false;
            }
        };

        EmployeeDataManagement data = new EmployeeDataManagement();
        data.addEmployee(new Employee("Tufail","A",100000,2));
        data.addEmployee(new Employee("Maan","B",10000,4));
        data.addEmployee(new Employee("TufailPart2","c",100000,3));
        data.addEmployee(new Employee("MaanPart2","A",100000,9));
        data.calculateAvgSalary();
        data.findEmployeeByName("Tufail");
        filterDeptA.filter(data,"Tufail");
    }
}
class Employee{
    String name;
    String dept;
    int salary;
    int exp;
    Employee(String name, String dept,int salary,int exp){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.exp = exp;
    }
    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getExp() {
        return exp;
    }
    public int getSalary() {
        return salary;
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
}


