package org.fundacionjala.at13.authenticator;
public class Auth{


    public boolean listVerification(String[] namesList){
        boolean res=true;
        for (int i = 0; i < namesList.length; i++) {
            res=res&&nameVerification(namesList[i]);
        }
        return res;
    }

    public boolean nameVerification(String userName){
        
        if(userName.matches("[a-z0-9]{6-10}")){
            return true;
        }else{
            return false;
        } 
    }

    public static boolean contains1Digit(String userName){
        if(userName.matches(".*[0-9].*")){
            return true;
        }else{
            return false;
        }
    }
}