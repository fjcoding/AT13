package org.fundacionjala.at13;

import java.util.Scanner;

public class Auth {

    public static void main(String[] args) {

        int n = 0;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s1.nextInt();
        String usernames[] = new String[n];
        System.out.println("Enter all the usernames:");
        for (int i = 0; i < n; i++) {
            usernames[i] = s2.nextLine();
        }

        System.out.println(validation(usernames));
    }

    // validation

    public static boolean validation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((sizeUsername(array[i]) && itHasLowerCase(array[i]) && itHasNumber(array[i]) && itHasOnlyNumberAndLowerCaseLetter(array[i]))==false) {
                return false;
            }
        }
        return true;
    }

    // it is between 6-10 characters long

    public static boolean sizeUsername(String username) {
        if (username.length() >= 6 && username.length() <= 10) {
            return true;
        }
        return false;
    }

    // contains at least 1 lowercase letter;

    public static boolean itHasLowerCase(String username) {
        for (int i = 0; i < username.length(); i++) {
            if ((int) username.charAt(i) >= 97 && (int) username.charAt(i) <= 122) {
                return true;
            }
        }
        return false;
    }

    // contains at least 1 number;

    public static boolean itHasNumber(String username) {
        for (int i = 0; i < username.length(); i++) {
            if ((int) username.charAt(i) >= 48 && (int) username.charAt(i) <= 57) {
                return true;
            }
        }
        return false;
    }

    // contains only numbers and lowercase letters.

    public static boolean itHasOnlyNumberAndLowerCaseLetter(String username) {
        for (int i = 0; i < username.length(); i++) {
            if ((int) username.charAt(i) < 48 || ((int) username.charAt(i) > 57 && ((int) username.charAt(i) < 97) || (int) username.charAt(i) > 122)) {
                return false;
            }
        }
        return true;
    }
}
