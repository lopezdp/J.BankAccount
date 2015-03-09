/**
 * David P. Lopez
 * COP2800
 * Banking Account Application for Checking & Savings Accounts
 */
package Banking;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class BankAccountsTransactions 
{
    public static void main(String[] args)
    {
        Logger.getGlobal().setLevel(Level.INFO);
        
        Scanner userInput;
        userInput = new Scanner(System.in);
        
        System.out.println("Please initialize your "
                + "Checking & Savings Account Balances.");
        System.out.println(" ");

        System.out.print("Enter your starting Checking Account Balance: ");
        
        boolean t3 = true;
        while(t3)
        {
            if(userInput.hasNextDouble())
            {
                boolean t1 = true;
                while(t1)
                {
                    double checkingBal = userInput.nextDouble();
                    if(checkingBal <= 0)
                    {
                        System.out.print("ERROR. This action will "
                                + "overdraft your account!!! "
                                + "Please enter a positive initial balance: ");
                    }
                    else
                    {
                        System.out.print("Enter your starting "
                                + "Savings Account Balance: ");
                        boolean t2 = true;
                        while(t2)
                        {
                            if(userInput.hasNextDouble())
                            {
                                double savingsBal = userInput.nextDouble();
                                if(savingsBal <= 0)
                                {
                                    System.out.print("ERROR. This action will "
                                            + "overdraft your account!!! "
                                            + "Please enter a positive initial balance: ");
                                }
                                else
                                {
                                    BankAccounts account = new BankAccounts(checkingBal, savingsBal);
                                    t2 = false;
                                }
                            }
                            else
                            {
                                break;
                            }
                        }
                        
                        do
                        {
                            System.out.println("Please select one of the "
                                    + "following transaction options:");
                            System.out.print("1. Deposit\n"
                                    + "2. Withdrawl\n"
                                    + "3. Transfer Funds\n");
                            
                            if(userInput.nextInt() == 1)
                            {
                                System.out.print("Please select "
                                        + "1. for Checking or "
                                        + "2. for Savings: ");
                                if(userInput.nextInt() == 1)
                                {
                                    System.out.print("Please enter "
                                            + "the deposit amount: ");
                                    if(userInput.hasNextDouble())
                                    {
                                        account.deposit(userInput.nextDouble(),"Checking");
                                    }
                                    
                                    
                                    
                                    
                                }
                            }
                      
                        }while(userInput.hasNextInt());
                        





                        t1 = false;
                    }   
                }    
            }
            else
            {
                System.out.println("Error!!! That is not a valid input!!!"
                        + "For security purposes we are ending your session.");
                break;    
            }    
        }
    }
}
