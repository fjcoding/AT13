package org.fundacionjala.at13.authenticator;
import java.util.Scanner;

/**
 *
 * @author Joel Rojas Roman
 */
public class Authenticator{

    public static final String MINIMUM_LENGTH="6";
    public static final String MAXIMUM_LENGTH="10";
    public static final String SOME_DIGIT=".*[1-9].*";
    public static final String SOME_LC_LETTER=".*[a-z].*";
    public static final String DIGIT_LETTER_LENGTH="[a-z0-9]{"+MINIMUM_LENGTH+","+MAXIMUM_LENGTH+"}";

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of usernames: ");
        int arrayLenght=scanner.nextInt();
        String[] usernamesList=new String[arrayLenght];
        for (int i = 0; i < usernamesList.length; i++) {
            System.out.print("Enter username "+(i+1)+ ": ");
            usernamesList[i]=scanner.next();
        }
        scanner.close();
        System.out.println("Array of usermanes complies condition: "+ Authenticator.usernamesListVerification(usernamesList));
    
    }

    public static boolean containsOneDigit(String username) {
        return username.matches(SOME_DIGIT);
    }

    public static boolean containsOneLowerCaseLetter(String username) {
        return username.matches(SOME_LC_LETTER);
    }
    public static boolean containsAmountCharacters(String username){
        return username.matches(DIGIT_LETTER_LENGTH);
    }
    
    public static boolean usernameVerification(String username){
        if (containsAmountCharacters(username)) {
            return containsOneLowerCaseLetter(username)&&containsOneDigit(username);
        }else{
            return false;
        }
    }

    public static boolean usernamesListVerification(String[] usernamesList){
        boolean res=true;
        int i=0;
        while (res&&i<usernamesList.length) {   
            res=res&&usernameVerification(usernamesList[i]);
            i++;
        }
        return res;
    }

}