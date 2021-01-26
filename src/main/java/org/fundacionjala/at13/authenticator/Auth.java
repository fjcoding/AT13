package org.fundacionjala.at13;

public class Auth.java {

    public static void main(String[] args) {
        
    }
    public boolean validate(String[]namesList){
        for(int i=0;i<namesList.length({

        }
        return res;
    }
    public static boolean checkNumbersAndLowerCaseLetters(String name){
        
        for(int i=0;i<name.length();i++){
            int asciiCode=(int)name.charAt(i);
            System.out.println(asciiCode);
            //conditional if ascii code doesnt belong to lowerCase letters or numbers
            if(((asciiCode>=97&&asciiCode<=122)||(asciiCode>=48&&asciiCode<=57))==false){
                return false;
            }
        }
        return true;
    }
}