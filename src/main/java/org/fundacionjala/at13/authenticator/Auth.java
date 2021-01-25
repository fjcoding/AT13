package org.fundacionjala.at13.authenticator;
public class Authentification{
    public static void main(String[] args){
        
    }

    public boolean listVerification(String[] namesList){
        boolean res;
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
}