/**
 * David P. Lopez
 * COP2800
 * Banking Account Application for Checking & Savings Accounts
 */
package Banking;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class BankAccounts {

    /** Instance Variables*/
    private double checkingBalance;
    private double savingsBalance;
    private double bankingFees;
    private double checkingTransactionCount;
    private double savingsTransactionCount;
    
    /**
     * Constructs a bank account object with a zero balance.
     */
    
    public BankAccounts()
    {
        checkingBalance = 0;
        savingsBalance = 0;
    }
    
    /**
     * Constructs a bank account object with a given balance.
     * @param initialBalChecking the initial balance for checking account
     * @param initialBalSavings the initial balance for savings account
     */
    
    public BankAccounts(double initialBalChecking, double initialBalSavings)
    {
        if (initialBalChecking < 0)
        {
            System.out.println("INSUFFICIENT FUNDS. "
                            + "CANNOT COMPLETE TRANSACTION!!!"
                    + "Please initialize your "
                    + "checking account with a positive balance.");  
            System.exit(0);
        }
        else if (initialBalSavings < 0)
        {
            System.out.println("INSUFFICIENT FUNDS. "
                            + "CANNOT COMPLETE TRANSACTION!!!"
                    + "Please initialize your "
                    + "savings account with a positive balance.");  
            System.exit(0);
        }
        else
        {
            checkingBalance = initialBalChecking;
            savingsBalance = initialBalSavings;
        }
    }
    
    
    
    /**
     * Deposits money into the bank account
     * @param amount the money to deposit into Savings OR Checking
     * @param account determines what account the money is deposited into
     * Accounts depending on user input.
     */
    
    public void deposit(double amount, String account)
    {
        String checking = "Checking";
        String savings = "Savings";
        
        if (account.equalsIgnoreCase(checking))
        {
            checkingBalance = (checkingBalance - bankingFees) + amount;
            checkingTransactionCount += 1;
        }
        else if (account.equalsIgnoreCase(savings))
        {
            savingsBalance = (savingsBalance - bankingFees) + amount;
            savingsTransactionCount += 1;   
        }
        else
        {
            System.out.println("ERROR you did not enter "
                + "the correct account type value");
            System.exit(0);
        }
    }
    
    /**
     * Withdraws money from the bank account
     * @param amount the money to withdraw 
     * @param account is the account to withdraw funds from
     */
    
    public void withdraw(double amount, String account)
    {
        String checking = "Checking";
        String savings = "Savings";
        
        if (account.equalsIgnoreCase("Checking"))
        {
            if(amount > checkingBalance)
            {
                checkingBalance = (checkingBalance - bankingFees) - amount;
                checkingTransactionCount += 1;
            }
            else
            {
                System.out.println("INSUFFICIENT FUNDS. "
                        + "CANNOT COMPLETE TRANSACTION!!!");
            }                    
        }
        else if (account.equalsIgnoreCase("Savings"))
        {
            if(amount > savingsBalance)
            {
                savingsBalance = (savingsBalance - bankingFees) - amount;
                savingsTransactionCount += 1;
            }
            else
            {
                System.out.println("INSUFFICIENT FUNDS. "
                        + "CANNOT COMPLETE TRANSACTION!!!");
            }
        } 
        else
        {
                System.out.println("ERROR you did not enter "
                + "the correct account type value");
                System.exit(0);
        } 
    }
    
    /**
     * Transfers money between bank accounts
     * @param amount the money to transfer between accounts
     * @param account the account to transfer the money into
     */
    
    public void transferFunds(double amount, String account)
    {
        switch (account) {
            case "Checking":
                if (amount < (savingsBalance + bankingFees))
                {
                    savingsBalance -= amount;
                    
                    checkingBalance = (checkingBalance - bankingFees) + amount;
                    checkingTransactionCount += 1;
                }
                else
                {
                    System.out.println("INSUFFICIENT FUNDS. "
                            + "CANNOT COMPLETE TRANSACTION!!!");
                    System.exit(0);
                }   break;
            case "Savings":
                if (amount < (checkingBalance + bankingFees))
                {
                    checkingBalance -= amount;
                    
                    savingsBalance = (savingsBalance - bankingFees) + amount;
                    savingsTransactionCount += 1;
                }
                else
                {
                    System.out.println("INSUFFICIENT FUNDS. "
                            + "CANNOT COMPLETE TRANSACTION!!!");
                    System.exit(0);
            }   break;    
        }
    }
    
    /**
     * Accumulates fees to charge the bank account
     * @param fee the money to charge for deposits & withdraws 
     */
    
    public void fees(double fee)
    {
        bankingFees = fee;
    }
    
    /**
     * Deducts a monthly charge based on the # of transactions and 
     * resets the transaction count.
     * @param monthlyItemCharge the charge per itemized deposit/withdraw
     */
    
    public void deductMonthlyCharge(double monthlyItemCharge )
    {
        int freeTransactionsAllotted = 0;
        double checkingTransactionFees;
        double savingsTransactionFees;
        
        checkingTransactionFees = (checkingTransactionCount - freeTransactionsAllotted) 
                            * monthlyItemCharge;
        savingsTransactionFees = (savingsTransactionCount - freeTransactionsAllotted) 
                            * monthlyItemCharge;
        
        checkingBalance -= checkingTransactionFees;
        savingsBalance -= savingsTransactionFees;
        
        checkingTransactionCount = 0;
        savingsTransactionCount = 0;
    }
    
    /**
     * Gets the current balance of the bank account.
     * @return the current Checking balance
     */
    
    public double getBalanceChecking()
    {
        return checkingBalance;
    }
    
    /**
     * Gets the current balance of the bank account.
     * @return the current Savings balance
     */
    
    public double getBalanceSavings()
    {
        return savingsBalance;
    }
    
}
