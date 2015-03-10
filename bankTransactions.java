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
        int nextInput = 0;
        double nextAmount = 0;

        System.out.print("Enter your starting Checking Account Balance: ");
        
        if(!(userInput.hasNextDouble()))
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
        
        if(!(userInput.hasNextDouble()))
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
        
        boolean t = true;

        while(t)
        {
            System.out.println(" ");
            System.out.println("Please select from one of "
                    + "the following transaction options: ");
            System.out.println("1. Deposit ");
            System.out.println("2. Withdrawal ");
            System.out.println("3. Transfer Funds");
            System.out.println("4. Exit & Get Balances");

            if(userInput.hasNextInt())
            {
                nextInput = userInput.nextInt();
            }
            else
            {
                System.out.println("Error!!! This is not a valid input!!!"
                        + "For security purposes we have recorded your IP address."
                        + "Please enter a valid input.");
            }
            
            if(nextInput == 1)
            {
                System.out.println(" ");
                System.out.println("Please select the account "
                        + "where you want to make your deposit: ");
                System.out.println("1. Checking");
                System.out.println("2. Savings");

                if(userInput.hasNextInt())
                {
                    nextInput = userInput.nextInt();
                }
                else
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                            + "For security purposes we have recorded your IP address."
                            + "Please enter a valid input.");
                }

                if(nextInput == 1)
                {
                    System.out.print("Enter the amount to deposit into Checking: ");

                    if(userInput.hasNextDouble())
                    {
                        nextAmount = userInput.nextDouble();
                    }
                    else
                    {
                        System.out.println("Error!!! This is not a valid input!!!"
                                + "For security purposes we have recorded your IP address."
                                + "Please enter a valid input.");
                    }
                    if(nextAmount > 0)
                    {
                        Account420.deposit(nextAmount, "Checking");
                        
                        System.out.println(" ");
                        System.out.println("The CURRENT balance in the Checking Account is: " 
                                + Account420.getBalanceChecking());
        
                        System.out.println("The CURRENT balance in the Savings Account is: " 
                                + Account420.getBalanceSavings());
                    }
                    else
                    {
                        System.out.println("Please enter a positive amount ONLY!!!"); 
                    }
                }
                else if(nextInput == 2)
                {
                    System.out.print("Enter the amount to deposit into Savings: ");

                    if(userInput.hasNextDouble())
                    {
                        nextAmount = userInput.nextDouble();
                    }
                    else
                    {
                        System.out.println("Error!!! This is not a valid input!!!"
                                + "For security purposes we have recorded your IP address."
                                + "Please enter a valid input.");
                    }
                    if(nextAmount > 0)
                    {
                        Account420.deposit(nextAmount, "Savings"); 
                        
                        System.out.println(" ");
                        System.out.println("The CURRENT balance in the Checking Account is: " 
                                + Account420.getBalanceChecking());
        
                        System.out.println("The CURRENT balance in the Savings Account is: " 
                                + Account420.getBalanceSavings());
                    }
                    else
                    {
                        System.out.println("Please enter a positive amount ONLY!!!"); 
                    } 
                }
                else
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                            + "For security purposes we have recorded your IP address."
                            + "Please enter a valid input.");
                }   
            }
            else if(nextInput == 2)
            {
                System.out.println(" ");
                System.out.println("Please select the account "
                        + "where you want to make your withdrawal: ");
                System.out.println("1. Checking");
                System.out.println("2. Savings");

                if(userInput.hasNextInt())
                {
                    nextInput = userInput.nextInt();
                }
                else
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                            + "For security purposes we have recorded your IP address."
                            + "Please enter a valid input.");
                }

                if(nextInput == 1)
                {
                    System.out.print("Enter the amount to withdrawal from Checking: ");

                    if(userInput.hasNextDouble())
                    {
                        nextAmount = userInput.nextDouble();
                    }
                    else
                    {
                        System.out.println("Error!!! This is not a valid input!!!"
                                + "For security purposes we have recorded your IP address."
                                + "Please enter a valid input.");
                    }
                    
                    if(nextAmount > 0)
                    {
                        Account420.withdraw(nextAmount, "Checking");

                        System.out.println(" ");
                        System.out.println("The CURRENT balance in the Checking Account is: " 
                                + Account420.getBalanceChecking());
        
                        System.out.println("The CURRENT balance in the Savings Account is: " 
                                + Account420.getBalanceSavings());                        
                    }
                    else
                    {
                    System.out.println("INSUFFICIENT FUNDS. "
                            + "CANNOT COMPLETE TRANSACTION!!!"
                            + "Please enter positive amounts ONLY!!!");
                    //System.exit(0);
                    }
                }
                else if(nextInput == 2)
                {
                    System.out.print("Enter the amount to withdrawal from Savings: ");

                    if(userInput.hasNextDouble())
                    {
                        nextAmount = userInput.nextDouble();
                    }
                    else
                    {
                        System.out.println("Error!!! This is not a valid input!!!"
                                + "For security purposes we have recorded your IP address."
                                + "Please enter a valid input.");
                    }
                    
                    if(nextAmount > 0)
                    {
                        Account420.withdraw(nextAmount, "Savings");
                        
                        System.out.println(" ");
                        System.out.println("The CURRENT balance in the Checking Account is: " 
                                + Account420.getBalanceChecking());
        
                        System.out.println("The CURRENT balance in the Savings Account is: " 
                                + Account420.getBalanceSavings());                        
                    }
                    else
                    {
                        System.out.println("INSUFFICIENT FUNDS. "
                                + "CANNOT COMPLETE TRANSACTION!!!"
                                + "Please enter positive amounts ONLY!!!");
                        //System.exit(0);
                    }
                    
                }
                else
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                            + "For security purposes we have recorded your IP address."
                            + "Please enter a valid input.");
                }   
            }
            else if(nextInput == 3)
            {
                System.out.println(" ");
                System.out.println("Please select the account "
                        + "where you want to transfer your funds into: ");
                System.out.println("1. Checking");
                System.out.println("2. Savings");

                if(userInput.hasNextInt())
                {
                    nextInput = userInput.nextInt();
                }
                else
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                            + "For security purposes we have recorded your IP address."
                            + "Please enter a valid input.");
                }

                if(nextInput == 1)
                {
                    System.out.print("Enter the amount to transfer into Checking: ");

                    if(userInput.hasNextDouble())
                    {
                        nextAmount = userInput.nextDouble();
                    }
                    else
                    {
                        System.out.println("Error!!! This is not a valid input!!!"
                                + "For security purposes we have recorded your IP address."
                                + "Please enter a valid input.");
                    }
                    
                    if(nextAmount > 0)
                    {
                        Account420.transferFunds(nextAmount, "Checking");
                        
                        System.out.println(" ");
                        System.out.println("The CURRENT balance in the Checking Account is: " 
                                + Account420.getBalanceChecking());
        
                        System.out.println("The CURRENT balance in the Savings Account is: " 
                                + Account420.getBalanceSavings());                        
                    }
                    else
                    {
                        System.out.println("INSUFFICIENT FUNDS. "
                                + "CANNOT COMPLETE TRANSACTION!!!"
                                + "Please enter positive amounts ONLY!!!");
                        //System.exit(0);
                    }
                }
                else if(nextInput == 2)
                {
                    System.out.print("Enter the amount to transfer into Savings: ");

                    if(userInput.hasNextDouble())
                    {
                        nextAmount = userInput.nextDouble();
                    }
                    else
                    {
                        System.out.println("Error!!! This is not a valid input!!!"
                                + "For security purposes we have recorded your IP address."
                                + "Please enter a valid input.");
                    }
                    
                    if(nextAmount > 0)
                    {
                        Account420.transferFunds(nextAmount, "Savings");
                        
                        System.out.println(" ");
                        System.out.println("The CURRENT balance in the Checking Account is: " 
                                + Account420.getBalanceChecking());
        
                        System.out.println("The CURRENT balance in the Savings Account is: " 
                                + Account420.getBalanceSavings());                        
                    }
                    else
                    {
                        System.out.println("INSUFFICIENT FUNDS. "
                                + "CANNOT COMPLETE TRANSACTION!!!"
                                + "Please enter positive amounts ONLY!!!");
                        //System.exit(0);
                    }
                }
                else
                {
                    System.out.println("Error!!! This is not a valid input!!!"
                            + "For security purposes we have recorded your IP address."
                            + "Please enter a valid input.");
                }  
            }
            else if (nextInput == 4)
            {
                t = false;
                break;
            } 
        }    

        System.out.println("The balance of the Checking Account is: " 
                + Account420.getBalanceChecking());
        
        System.out.println("The balance of the Savings Account is: " 
                + Account420.getBalanceSavings());
   
    }
}
