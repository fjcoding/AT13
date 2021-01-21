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

    public String showStudentsInformation() {
        return "Hello "+"my name is " + name + "\n" +
                "I like to be called '" + nickName + "\n" +
                "I am "+ age +" years old" + "\n" +
                "I am " + career + "\n" +
                "I study at " + university+ " university \n" +
                "My programming languages are " + programingLanguages +"\n" +
                "My residence city " + residenceCity;
    }
}