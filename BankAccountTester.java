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

public class BankAccountTester {
    
    public static void main(String[] args) {
        
   
        // TODO code application logic here
        BankAccount myAccount = new BankAccount();
        
        myAccount = new BankAccount(100);
        System.out.println(myAccount.getBalance());
        
        myAccount.fees(5);
        
        myAccount.deposit(100000);
        System.out.println(myAccount.getBalance());
        
        myAccount.withdraw(100);
        System.out.println(myAccount.getBalance());
        
        myAccount.withdraw(200);
        System.out.println(myAccount.getBalance());
        
        myAccount.withdraw(10000);
        System.out.println(myAccount.getBalance());
        
        myAccount.withdraw(40000);
        System.out.println(myAccount.getBalance());
        
        myAccount.deposit(100000);
        System.out.println(myAccount.getBalance());
        
        myAccount.deductMonthlyCharge(1);
        System.out.println(myAccount.getBalance());      
    } 
}
