package Assignment_5;

public class Fourth {
    public static void main(String[] args) {
            employeeTax(56000);
    }
    static void employeeTax(int salary){
        int tax = 0;
        if(salary>0 && salary<=50000) tax = 0;
        else if(salary>50000 && salary<=60000) tax = (50000*10)/100;
        else if(salary>60000 && salary<=150000) tax = (50000*20)/100;
        else if(salary>150000) tax =  (50000*30)/100;
        System.out.println("Income Tax is " + tax);
    }
}
