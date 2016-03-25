package maintest;

import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseObject;
import org.parse4j.ParseUser;
import org.parse4j.callback.SaveCallback;
import org.parse4j.callback.SignUpCallback;

/**
 * Created by deplike on 23.3.2016.
 */
public class Main {
    private static String APP_ID = "DEPLIKE";
    private static String APP_REST_API_ID = "DEPLIKE";
    public static void main(String[] args){
        Parse.initializeAsRoot(APP_ID,APP_REST_API_ID);
        ParseUser pu=new ParseUser();
        pu.setEmail("parse4j@gmail.com");
        pu.setPassword("test");
        pu.setUsername("parse4j");

        try {
            pu.signUp();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("WTES");
    }
}
