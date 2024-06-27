package ProjectBankSystem;

import java.util.*;

public class Customer
{
    
	private String name;
	//private String password;
    private String mobileNumber;
    private int id;
    private String address;
    private static double balance=0;
  static  List<Transaction> trans1=new ArrayList<>();
     

    public Customer(String name, String mobileNumber, int id, String address) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.id = id;
        this.address = address;
        //this.password=password;
        
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getId() {
        return id;
    }

//    public boolean checkPassword(String enteredPassword) {
//        return password.equals(enteredPassword);
//    }
    public String getAddress() {
        return address;
    }

   

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
        Transaction tr1=new Transaction("Deposit",amount);
        trans1.add(tr1);
        
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
            Transaction tr2=new Transaction("Withdraw",amount);
            trans1.add(tr2);
            
            return true;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
            return false;
        }
    }
    
    public static void printlist(Customer c)
    {
    	trans1.toString();
    	System.out.println(trans1);
    }
    
}