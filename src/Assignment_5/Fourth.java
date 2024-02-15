package Assignment_5;

public class Fourth {
    public static void main(String[] args) {
            employeeTax(300000);
    }
    static void employeeTax(int salary){
        double tax = 0;
        if(salary>0 && salary<=50000) tax = 0;
        else if(salary<=60000) tax = (salary-50000)*0.1;
        else if(salary<=150000) tax = 1000 + ((salary-60000)*0.2);
        else if(salary>150000) tax =  1000+ 18000+ ((salary-150000)*0.3);
        System.out.println("Income Tax is " + tax);
    }
}
