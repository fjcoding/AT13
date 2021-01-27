//package org.fundacionjala.at13;
import java.util.Scanner;

public class Auth {

    public static final int MINIMUM_SIZE = 6;
    public static final int MAXIMUM_SIZE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int numberOfUser = scanner.nextInt();
        String usernames[] = new String[numberOfUser];
        System.out.println("Enter all the usernames:");
        for (int i = 0; i < numberOfUser; i++) {
            usernames[i] = scanner.next();
        }
        // verify showing in console the array created
        for (String username: usernames) {
            System.out.println(itHasTheRigthLength(username));
        }
    }

    public static boolean itHasTheRigthLength(String username) {
        if (username.length() >= MINIMUM_SIZE && username.length() <= MAXIMUM_SIZE) {
            return true;
        }
        return false;
    }
}