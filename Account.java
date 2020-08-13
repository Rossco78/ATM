import java.util.Arraylist;

;public class Account{

    /**
     * The name of the account
     */
    private String name;
    
    /**
     * The current balance of the account
     */
    private double balance;

    /**
     * The account id number
     */
    private String uuid;

    /**
     * The user object that owns this account
     */
    private User holder;

    /**
     * The list of transactions for this account
     */

    private Arraylist<Transaction> transactions;
}