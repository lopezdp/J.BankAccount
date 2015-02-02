BankAccount CLASS 

/**
 * David P. Lopez
 * COP2800
 * Bank Account Application
 */
package Banking;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class BankAccount {
    
    /** Instance Variables*/
    private double balance;
    private double bankingFees;
    private double transactionCount;
    
    /**
     * Constructs a bank account object with a zero balance.
     */
    
    public BankAccount()
    {
        balance = 0;
    }
    
    /**
     * Constructs a bank account object with a given balance.
     * @param initialBalance the initial balance
     */
    
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    
    /**
     * Deposits money into the bank account
     * @param amount the money to deposit
     */
    
    public void deposit(double amount)
    {
        balance = (balance - bankingFees) + amount;
        transactionCount += 1;
    }
    
    /**
     * Withdraws money from the bank account
     * @param amount the money to withdraw 
     */
    
    public void withdraw(double amount)
    {
        balance = (balance - bankingFees) - amount;
        transactionCount += 1;
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
        double transactionFees;
        transactionFees = (transactionCount - freeTransactionsAllotted) 
                            * monthlyItemCharge;
        
        balance -= transactionFees;
        transactionCount = 0;
    }
    
    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    
    public double getBalance()
    {
        return balance;
    }  
}
