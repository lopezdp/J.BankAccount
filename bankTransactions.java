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
                + "Checking & Savings Account Balances with a positive amount.");
        System.out.println(" ");
        
        double savingsBal = 0;
        double checkingBal = 0;

        System.out.print("Enter your starting Checking Account Balance: ");
        
        if(!userInput.hasNextDouble())
        {
            System.out.println("Error!!! This is not a valid input!!!"
                    + "For security purposes we are ending your session.");
            System.exit(0);
        }
        else
        {
            checkingBal = userInput.nextDouble();
        }
        
        System.out.print("Enter your starting Savings Account Balance: ");
        
        if(!userInput.hasNextDouble())
        {
            System.out.println("Error!!! This is not a valid input!!!"
                    + "For security purposes we are ending your session.");
            System.exit(0);
        }
        else
        {
            savingsBal = userInput.nextDouble();
        }
        
        BankAccounts Account420 = new BankAccounts(checkingBal, savingsBal);
        
        System.out.println(" ");
        System.out.println("Please select from one of "
                + "the following transaction options: \n"
                + "1. Deposit \n"
                + "2. Withdrawal \n"
                + "3. Transfer Funds \n");
        
        if(!userInput.hasNextInt())
        {
            System.out.println("Error!!! This is not a valid input!!!"
                    + "For security purposes we are ending your session.");
            System.exit(0);
        }
        else if(userInput.nextInt() == 1)
        {
            System.out.println(" ");
            System.out.println("Please select the account "
                    + "where you want to make your deposit: \n"
                    + "1. Checking \n"
                    + "2. Savings \n");
            
            if(!userInput.hasNextInt())
            {
                System.out.println("Error!!! This is not a valid input!!!"
                        + "For security purposes we are ending your session.");
                System.exit(0);
            }
            else if(userInput.nextInt() == 1)
            {
                System.out.print("Enter the amount to deposit into Checking: ");
                
                if(!userInput.hasNextDouble())
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                               + "For security purposes we are ending your session.");
                    System.exit(0);
                }
                else
                {
                    Account420.deposit(userInput.nextDouble(), "Checking");
                }
            }
            else if(userInput.nextInt() == 2)
            {
                System.out.print("Enter the amount to deposit into Savings: ");
                
                if(!userInput.hasNextDouble())
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                               + "For security purposes we are ending your session.");
                    System.exit(0);
                }
                else
                {
                    Account420.deposit(userInput.nextDouble(), "Savings");
                }
            }
            else
            {
                System.out.println("Error!!! This is not a valid selection!!!"
                               + "For security purposes we are ending your session.");
                    System.exit(0);
            }   
        }
        else if(userInput.nextInt() == 2)
        {
            System.out.println(" ");
            System.out.println("Please select the account "
                    + "where you want to make your withdrawal: \n"
                    + "1. Checking \n"
                    + "2. Savings \n");
            
            if(!userInput.hasNextInt())
            {
                System.out.println("Error!!! This is not a valid input!!!"
                        + "For security purposes we are ending your session.");
                System.exit(0);
            }
            else if(userInput.nextInt() == 1)
            {
                System.out.print("Enter the amount to withdrawal from Checking: ");
                
                if(!userInput.hasNextDouble())
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                               + "For security purposes we are ending your session.");
                    System.exit(0);
                }
                else
                {
                    if(userInput.nextDouble() > 0)
                        Account420.withdraw(userInput.nextDouble(), "Checking");
                    else
                    {
                        System.out.println("INSUFFICIENT FUNDS. "
                                + "CANNOT COMPLETE TRANSACTION!!!"
                                + "Please enter positive amounts ONLY!!!");
                        System.exit(0);
                    }
                }
            }
            else if(userInput.nextInt() == 2)
            {
                System.out.print("Enter the amount to withdrawal from Savings: ");
                
                if(!userInput.hasNextDouble())
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                               + "For security purposes we are ending your session.");
                    System.exit(0);
                }
                else
                {
                    if(userInput.nextDouble() > 0)
                        Account420.withdraw(userInput.nextDouble(), "Savings");
                    else
                    {
                        System.out.println("INSUFFICIENT FUNDS. "
                                + "CANNOT COMPLETE TRANSACTION!!!"
                                + "Please enter positive amounts ONLY!!!");
                        System.exit(0);
                    }
                }
            }
            else
            {
                System.out.println("Error!!! This is not a valid selection!!!"
                               + "For security purposes we are ending your session.");
                    System.exit(0);
            }   
        }
        else if(userInput.nextInt() == 3)
        {
            System.out.println(" ");
            System.out.println("Please select the account "
                    + "that you want to transfer funds into: \n"
                    + "1. Checking \n"
                    + "2. Savings \n");
            
            if(!userInput.hasNextInt())
            {
                System.out.println("Error!!! This is not a valid input!!!"
                        + "For security purposes we are ending your session.");
                System.exit(0);
            }
            else if(userInput.nextInt() == 1)
            {
                System.out.print("Enter the amount to transfer into Checking: ");
                
                if(!userInput.hasNextDouble())
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                               + "For security purposes we are ending your session.");
                    System.exit(0);
                }
                else
                {
                    Account420.transferFunds(userInput.nextDouble(), "Checking");
                }
            }
            else if(userInput.nextInt() == 2)
            {
                System.out.print("Enter the amount to transfer into Savings: ");
                
                if(!userInput.hasNextDouble())
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                               + "For security purposes we are ending your session.");
                    System.exit(0);
                }
                else
                {
                    Account420.transferFunds(userInput.nextDouble(), "Savings");
                }
            }
            else
            {
                System.out.println("Error!!! This is not a valid selection!!!"
                               + "For security purposes we are ending your session.");
                    System.exit(0);
            }
            
            
        }
        
        
        
        System.out.println(Account420.getBalanceChecking());
        System.out.println(Account420.getBalanceSavings());
        
        
        
    }
}
