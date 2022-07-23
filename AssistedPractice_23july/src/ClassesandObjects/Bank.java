package ClassesandObjects;
//Classes and Objects Program

public class Bank 
{
    private String name;
    private int account_no;
    private float balance;
    
    public void getData() 
    {
        name = "SAI KUMAR NAIK";
        account_no = 1054678342;
        balance = 0;
    }
    private void deposit(float amt) 
    {
        balance += amt; //balance = balance + amt
    }
    private float calculateAmount(float principal, float rate, int time) 
    {
        float simpleInterest = (principal * rate * time) / 100;
        float amount = principal + simpleInterest;
        return amount;
    }
    public void displayData() 
    {
        System.out.println("Name: " + name);
        System.out.println("Account number: " + account_no);
        System.out.println("Balance: " + balance);
    }
    public static void main (String args[]) 
    {
        Bank obj = new Bank();
        obj.getData();
        obj.deposit(20000);
        float amount = obj.calculateAmount(300, 4, 2);
        System.out.println("Amount calculated for Rs 25000/- at a rate of 4% for 2 years is: " + amount);
        obj.displayData();
    }
}

