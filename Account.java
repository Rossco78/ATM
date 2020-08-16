import java.util.ArrayList;

;public class Account{

    /**
     * The name of the account
     */
    private final String name;

    
    /**
     * The account id number
     */
    private final String uuid;

    /**
     * The user object that owns this account
     */
    private final User holder;

    /**
     * The list of transactions for this account
     */

    private final ArrayList<Transaction> transactions;

    /**
     * 
     * @param name      the name of the account
     * @param holder    the User object that holds this account
     * @param theBank   the bank that issues the account
     */
    public Account(final String name, final User holder, final Bank theBank) {

        // set the account name and holder
        this.name = name;
        this.holder = holder;

        // get new account UUID
        this.uuid = theBank.getNewAccountUUID();

        // init transactions
        this.transactions = new ArrayList<Transaction>();

        // add to holder and bank lists
        holder.addAccount(this);
        theBank.addAccount(this);

        
    }
}
