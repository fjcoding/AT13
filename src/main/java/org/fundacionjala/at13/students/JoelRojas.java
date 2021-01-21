package org.fundacionjala.at13.students;

public class JoelRojas{

<<<<<<< HEAD
/* Joel Rodrigo Rojas Roman
Joel
27
Systems Engineering
UMSS
Java
Quillacollo,Cochabamba */
    public String getResidenceCity(){
        return "Currently I live in "+residenceCity+".";
=======
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
>>>>>>> da18f389e4571fb870448982df7e449cef23fe56
    }
}
