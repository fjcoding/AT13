package org.fundacionjala.at13.students;
public class DanielaSantaCruz{

    private String name = "Daniela Santa Cruz Andrade"; 
    private String nickname = "Dani";
    private int age = 22;
    private String career = "Systems engineering";
    private String university = "UMSS";
    private String programmingLanguages = "java";
    private String recidenceCity = "Cochabamba";
    
    public String getResidenceCity(){
        return "Currently I live in "+residenceCity+".";
    }

    public String ShowNickName(){
        return "I like to be called "+this.nickName;
    }
}