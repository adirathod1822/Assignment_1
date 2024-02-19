package Assignment_6;
import java.util.*;
class Student{
    String name;
    int age;
    double grade;
    Student(String name, int age,double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }
}
class StudentDataManagement {
    private List<Student> st;
    public StudentDataManagement() {
        st = new ArrayList<>();
    }
    public List<Student> getStudentDataManagement(){
        return st;
    }
    public void addStudent(Student student) {
        st.add(student);
    }
    public double calculateAvg(){
        return st.stream().mapToInt(Student::getAge).average().getAsDouble();
    }
    public void findStudentsByName(String name){
        System.out.println("Name: "+ st.stream().filter(Student -> name.equalsIgnoreCase(Student.getName())).toList().get(0).getName() );
        System.out.println("Age: "+ st.stream().filter(Student -> name.equalsIgnoreCase(Student.getName())).toList().get(0).getAge() );
        System.out.println("Name: "+ st.stream().filter(Student -> name.equalsIgnoreCase(Student.getName())).toList().get(0).getGrade() );
    }
}

public class Fourth {
    public static void main(String[] args) {
        StudentDataManagement data = new StudentDataManagement();
        data.addStudent(new Student("Rex", 20, 85.5));
        data.addStudent(new Student("max", 22, 91.0));
        data.addStudent(new Student("jex", 21, 78.3));
        data.addStudent(new Student("fex", 23, 88.9));
        data.findStudentsByName("jex");
        System.out.println("Avergae age: " + data.calculateAvg());
    }
}
