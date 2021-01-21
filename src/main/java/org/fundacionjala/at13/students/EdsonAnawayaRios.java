package org.fundacionjala.at13.students;
public class EdsonAnawayaRios{
    /*Edson Añawaya Rios
    I like to be called Edson
    Age: 28
    career: Informatica
    university: UMSA
    preferred programming languages: NodeJs
    residence city: La Paz - Bolivia*/
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
