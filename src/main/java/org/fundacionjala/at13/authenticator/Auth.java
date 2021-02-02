package org.fundacionjala.at13.authenticator;

import java.util.Scanner;

public final class Auth {

    public static final int MINIMUM_SIZE = 6;
    public static final int MAXIMUM_SIZE = 10;
    public static final int ASCII_CODE_ZERO = 48;
    public static final int ASCII_CODE_NINE = 57;
    public static final int ASCII_CODE_LETTER_A = 97;
    public static final int ASCII_CODE_LETTER_Z = 122;

    private Auth() { }

    public static void main(final String[] args) {
        int numberOfUser = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        numberOfUser = scanner.nextInt();
        String[] usernames = new String[numberOfUser];
        System.out.println("Enter all the usernames:");
        for (int i = 0; i < numberOfUser; i++) {
            usernames[i] = scanner.next();
        }
        System.out.println(validationOfUser(usernames));
    }

    // this is the main method for solving the problem

    public static boolean validationOfUser(final String[] listOfUsers) {
        for (String username : listOfUsers) {
            if (!(itHasTheRigthLength(username)
             && itHasLowerCase(username)
             && itHasNumber(username)
             && itHasOneNumberLowerCaseLetter(username))) {
                return false;
            }
        }
        return true;
    }

    // it is between 6-10 characters long

    public static boolean itHasTheRigthLength(final String username) {
        if (username.length() >= MINIMUM_SIZE
         && username.length() <= MAXIMUM_SIZE) {
            return true;
        }
        return false;
    }

    // contains at least 1 lowercase letter

    public static boolean itHasLowerCase(final String username) {
        for (int i = 0; i < username.length(); i++) {
            if ((int) username.charAt(i) >= ASCII_CODE_LETTER_A
             && (int) username.charAt(i) <= ASCII_CODE_LETTER_Z) {
                return true;
            }
        }
        return false;
    }

    // contains at least 1 number

    public static boolean itHasNumber(final String username) {
        for (int i = 0; i < username.length(); i++) {
            if ((int) username.charAt(i) >= ASCII_CODE_ZERO
             && (int) username.charAt(i) <= ASCII_CODE_NINE) {
                return true;
            }
        }
        return false;
    }

    // contains only numbers and lowercase letters

    public static boolean itHasOneNumberLowerCaseLetter(final String username) {
        for (int i = 0; i < username.length(); i++) {
            if ((int) username.charAt(i) < ASCII_CODE_ZERO
             || ((int) username.charAt(i) > ASCII_CODE_NINE
              && ((int) username.charAt(i) < ASCII_CODE_LETTER_A)
               || (int) username.charAt(i) > ASCII_CODE_LETTER_Z)) {
                return false;
            }
        }
        return true;
    }
}
