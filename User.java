import java.util.ArrayList;
import java.security.MessageDigest;

public class User<Account> {

    /**
     * The first name of user
     */
    private String firstName;

    /**
     * The last name of user
     */
    private String lastName;

    /**
     * The ID number of user
     */
    private String uuid;


    /**
     * The MD5 hash of user's pin number
     */
    private byte pinHash[];

    /**
     * The list of accounts for this user
     */
    private ArrayList<Account> accounts;

    public User(String firstName, String lastName, String pin, Bank theBank){

        // set users name
        this.firstName =firstName;
        this.lastName = lastName;

        // store the pin's MD5 hash, rather than the original pin
        MessageDigest md = MessageDigest.getInstance("MD5");
        this.pinHash = md.digest(pin.getBytes());

        // create empty list of accounts
        this.accounts = new ArrayList<Account>();

        // print log message
        System.out.printf("New user %s, %s with ID %s created. \n",
         lastName, firstName, this.uuid)

    }

    

    }


}