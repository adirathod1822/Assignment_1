package Assignment_5;
public class First {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.balance = 100000;
        System.out.println("Balance after deposit: " + b1.deposit(1000));
        System.out.println("Balance after withdraw: " + b1.withdraw(1000));
        System.out.println("Balance: " + b1.Balance());

    }
}
class Bank{
    int balance;
    int deposit(int amount){
        return this.balance+=amount;
    }
    int Balance(){
        return this.balance;}
    int withdraw(int amount){
        return this.balance-=amount;
    }
}
