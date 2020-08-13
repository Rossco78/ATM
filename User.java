import java.util.ArrayList;

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
    private Arraylist<Account> accounts;
    
}