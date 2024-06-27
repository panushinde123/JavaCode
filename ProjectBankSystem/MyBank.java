package ProjectBankSystem;
import java.util.Scanner;

import java.util.*;
public class MyBank
{
	
	public static void main(String args[])
	{
		
	Scanner scanner = new Scanner(System.in);
    bank bank1 = new bank();
    {

    while (true) 
    {
        System.out.println("1. Add New Customer");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Print Transactions");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();

        switch (choice) 
        {
            case 1:
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Enter mobile number: ");
                String mobileNumber = scanner.next();
                
                System.out.print("Enter address: ");
                String address = scanner.next();
                bank1.addCustomer(name, mobileNumber,address);
                
               
                break;
            case 2:
                System.out.print("Enter customer ID: ");
                int customerId = scanner.nextInt();
//                System.out.print("Enter password: ");
//                String pasword = scanner.next();
                Customer depositCustomer = bank1.getCustomer(customerId);
                
                if (depositCustomer != null)
                {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    depositCustomer.deposit(depositAmount);
                }
                else
                {
                    System.out.println("Customer not found");
                }
                break;
            case 3:
                System.out.print("Enter customer ID: ");
                customerId = scanner.nextInt();
                Customer withdrawCustomer = bank1.getCustomer(customerId);
                if (withdrawCustomer != null)
                {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdrawCustomer.withdraw(withdrawAmount);
                } 
                else
                {
                    System.out.println("Customer not found");
                }
                break;
            case 4:
            	   System.out.print("Enter customer ID: ");
                   customerId = scanner.nextInt();
                   Customer printCustomer = bank1.getCustomer(customerId);
                   if(printCustomer!=null)
                       Customer.printlist(printCustomer);
                   else
                	   System.out.println("Customer is not found");
            	
                   break;
            case 5:
                System.out.println("Exiting System");
                scanner.close();
                System.exit(0);
                break;
            
            default:
                System.out.println("Invalid choice");
        }
    
    }}
}}