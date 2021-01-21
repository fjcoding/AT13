package org.fundacionjala.at13.students;

public class JoelRojas{

    private String name;
    private String nickName;
    private int age;
    private String career;
    private String university;
    private String programingLanguages;
    private String residenceCity;

    public JoelRojas(){
        this.name="Joel Rodrigo Rojas Roman";
        this.nickName="Joel";
        this.age=27;
        this.career="Systems Engineering";
        this.university="UMSS";
        this.programingLanguages="Java";
        this.residenceCity="Quillacollo, Cochabamba";
    }

    public String ShowNickName(){
        return "I like to be called "+this.nickName;
    }

    public String getResidenceCity(){
        return "Currently I live in "+residenceCity+".";
    }
}
