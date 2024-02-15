package Assignment_5;
class Bank{
    int accountNumber;
    double balance;
    boolean dep;
    double deposit(double amount){
        this.dep = true;
        return this.balance+=amount;
    }
    void  withdraw(double amount){
        if(dep) this.balance -= amount;
        else System.out.println("You must deposit some amount");
    }
    double Balance(int accountNumber){
        return this.balance;
    }
}
public class First {
    public static void main(String[] args) {
        Bank b = new Bank();
            b.accountNumber = 00000000000624;
            b.deposit(10000);
            b.withdraw(1000);

            System.out.println(b.Balance(b.accountNumber));
    }

}
