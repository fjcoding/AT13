package org.fundacionjala.at13;

import org.fundacionjala.at13.students.*;
import org.fundacionjala.at13.authenticator.*;

public class Main {

    public static void main(String[] args) {
/*         CristianChoque cristian = new CristianChoque();
        DanielaSantaCruz daniela = new DanielaSantaCruz();
        EdsonAnawayaRios edson = new EdsonAnawayaRios();
        GustavoHuanca gustavo = new GustavoHuanca();
        JessickaMoyaAndrade jessicka = new JessickaMoyaAndrade();
        JoelRojas joel = new JoelRojas();
        JorgeCaceres jorge = new JorgeCaceres();
        JuanGonzales juan = new JuanGonzales();
        PaolaAguilar paola = new PaolaAguilar();
        RaymundoGuaraguara raymundo = new RaymundoGuaraguara();
        SaulCaspa saul = new SaulCaspa();
       
        System.out.println(cristian.showStudentsInformation());
        System.out.println(daniela.showStudentsInformation());
        System.out.println(edson.showStudentsInformation());
        System.out.println(gustavo.showStudentsInformation());
        System.out.println(jessicka.showStudentsInformation());
        System.out.println(joel.showStudentsInformation());
        System.out.println(jorge.showStudentsInformation());
        System.out.println(juan.showStudentsInformation());
        System.out.println(paola.showStudentsInformation());
        System.out.println(raymundo.showStudentsInformation());
        System.out.println(saul.showStudentsInformation()); */

        String[] usernames1 = {"john123", "alex222", "sandra1"}; // returns true

        String[] usernames2 = {"john123", "alex222", "sandraW"}; // returns false because sandraW has no number

        String[] usernames3 = {"john_123", "alex222", "sandra1"}; // returns false because john_123 contains an invalid character

        String[] usernames4 = {"******12", "alexander4", "RICARDO"};
        
        System.out.println("Array usermane1 :"+ Authenticator.listUsernameVerification(usernames1));
        System.out.println("Array usermane2 :"+ Authenticator.listUsernameVerification(usernames2));
        System.out.println("Array usermane3 :"+ Authenticator.listUsernameVerification(usernames3));
        System.out.println("Array usermane4 :"+ Authenticator.listUsernameVerification(usernames4));
    }
}