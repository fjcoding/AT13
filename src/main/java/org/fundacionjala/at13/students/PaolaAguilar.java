package org.fundacionjala.at13.students;

public class PaolaAguilar{
    /** 
     
    Paola Ximena Aguilar Quiñones
    I like to be called Pao
    I´m 29 years old
    I studied Systems engineer and Graphic Design
    at USFXCH University and TECBA institute
    My preferred programming languages are PHP and JavaScript
    I live in Sucre 
    
    */

    private String name = "Paola Ximena Aguilar Quiñones";
    private String nickName = "Pao";
    private int age = 29;
    private String career = "Computer Engineer";
    private String university = "Universidad de San Francisco Xavier de Chuquisaca";
    private String programingLanguages = "PHP and JavaScrip";
    private String residenceCity = "Sucre";

    public String getResidenceCity(){
        return "Currently I live in "+residenceCity+".";
    }
    public String ShowNickName(){
        return "I like to be called "+this.nickName;
    }
    public String ShowName(){
        return "Hi, my name is "+this.name;
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
    public String getCareer(){
		return "I have studied" + this.career;
    }
    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programingLanguages;
    }
    public String ShowAge(){
        return "Hi, my name is "+this.age;
    } 
}
