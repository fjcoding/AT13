package org.fundacionjala.at13.authenticator;
public class Authenticator{

    public static boolean containsOneDigit(String username) {
        if(username.matches(".*[1-9].*")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean containsOneLowerCaseLetter(String username) {
        if(username.matches(".*[a-z].*")){
            return true;
        }else{
            return false;
        }
    }
    public static boolean lenghtUsername(String username){
        if(username.matches("[a-z0-9]{6,10}")){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean usernameVerification(String username){
        if (lenghtUsername(username)) {
            if(containsOneLowerCaseLetter(username)&&containsOneDigit(username)){
                return true;
            }else{
                return false;
            }  
        }else{
            return false;
        }
    }

    public static boolean listUsernameVerification(String[] usernamesList){
        boolean res=true;
        int i=0;
        while (res&&i<usernamesList.length) {   
            System.out.println(usernamesList[i]);
            res=res&&usernameVerification(usernamesList[i]);
            i++;
        }
        return res;
    }

}