
package org.fundacionjala.at13.students;
public class CristianChoque{

    private String name;
    private String nickName;
    private int age;
    private String career;
    private String university;
    private String programingLanguages;
    private String residenceCity;

    public CristianChoque(){
        this.name="Cristian Felix Choque Quispe";
        this.nickName="Cristian";
        this.age=30;
        this.career="Electronic Engineering";
        this.university="UMSA";
        this.programingLanguages="c++";
        this.residenceCity="La Paz";
    }
    /*
    Full Name: Cristian Felix
    I like to be called... Cristian
    age: 30
    career: Electronic Engineering
    university: UMSA
    preferred programming languages: C++
    residence city: La Paz
    */
    public String ShowNickName(){
        return "I like to be called "+this.nickName;
    }
    public String ShowName(){
        return "Hi, my name is "+this.name;
    }
}

