// Fig. 17.7: AccountRecord.java
// A class that represents one record of information.
package  homework08;

import java.io.Serializable;

public class AccountRecord implements Serializable {
    private int account;
    private String clientFullName;
    private Date openAccountDate;
    private double balance;
    
    // no-argument constructor calls other constructor with default values
    public AccountRecord() {
        this( 0, "", new Date(), 0.0 );
    }
    public AccountRecord(AccountRecord a) {
        this( a.account,a.clientFullName, a.openAccountDate, a.balance );
    }
    // initialize a record
    public AccountRecord( int acct, String n, Date d, double bal ) {
        setAccount( acct );
        setClientFullName( n );
        setOpenAccountDate( d );
        setBalance( bal );
    }
    
    // set account number
    public void setAccount( int acct ) {
        account = acct;
    }
    
    // get account number
    public int getAccount() {
        return account;
    }
    
    // set first name
    public void setClientFullName( String name ) {
        clientFullName = name;
    }
    
    // get first name
    public String getClientFullName() {
        return clientFullName;
    }
    
    // set last name
    public void setOpenAccountDate( Date  d ) {
        openAccountDate = new Date(d);
    }
    
    // get last name
    public Date  getOpenAccountDate() {
        return new Date(openAccountDate);
    }
    
    // set balance
    public void setBalance( double bal ) {
        balance = bal;
    }
    
    // get balance
    public double getBalance() {
        return balance;
    }
    
    public String toString(){
        
        return String.format("\nAccount No. %s\nCustomer : %s\nDate open:  %s\nBallance: %2f\n",
                this.account, this.clientFullName,this.openAccountDate, this.balance);
    }
    
} // end class AccountRecord

