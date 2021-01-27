//package org.fundacionjala.at13;
import java.util.Scanner;

public class Auth {
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
            System.out.println(username);
        }
    }
}