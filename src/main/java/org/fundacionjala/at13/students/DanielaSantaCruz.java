package org.fundacionjala.at13.students;
public class DanielaSantaCruz{

    private String name;
    private String nickname;
    private int age;
    private String career;
    private String university;
    private String programmingLanguages;
    private String recidenceCity;
    
    public DanielaSantaCruz(){
        this.name = "Daniela Santa Cruz Andrade"; 
        this.nickname = "Dani";
        this.age = 22;
        this.career = "Systems engineering";
        this.university = "UMSS";
        this.programmingLanguages = "java";
        this.recidenceCity = "Cochabamba";
    }

/* Daniela Santa Cruz Andrade
I like to be called Dani
I am 22 years old
Systems engineering
San Simon University
Java
Cochabamba */
    public String ShowNickName(){
        return "I like to be called "+this.nickName;
    }
    public String ShowName(){
        return "Hi, my name is "+this.name;
    }
}