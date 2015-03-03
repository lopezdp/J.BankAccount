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
    private double transactionCount;
    
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
     * @param initialBalChecking the initial balance for checking account
     */
    
    public BankAccounts(double initialBalChecking, double initialBalSavings)
    {
        checkingBalance = initialBalChecking;
        savingsBalance = initialBalSavings;
    }
    
    /**
     * Deposits money into the bank account
     * @param amount the money to deposit into Savings OR Checking
     * Accounts depending on user input.
     */
    
    public void depositChecking(double amount)
    {
        checkingBalance = (checkingBalance - bankingFees) + amount;
        transactionCount += 1;
    }
    
    public void depositSavings(double amount)
    {
        savingsBalance = (savingsBalance - bankingFees) + amount;
        transactionCount += 1;
    }
    
    
    /**
     * Withdraws money from the bank account
     * @param amount the money to withdraw 
     */
    
    public void withdrawChecking(double amount)
    {
        checkingBalance = (checkingBalance - bankingFees) - amount;
        transactionCount += 1;
    }
    
    public void withdrawSavings(double amount)
    {
        savingsBalance = (savingsBalance - bankingFees) - amount;
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
