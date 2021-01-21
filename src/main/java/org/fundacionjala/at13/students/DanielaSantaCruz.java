package org.fundacionjala.at13.students;
public class DanielaSantaCruz{

    private String name = "Daniela Santa Cruz Andrade"; 
    private String nickName = "Dani";
    private int age = 22;
    private String career = "Systems engineering";
    private String university = "UMSS";
    private String programmingLanguages = "java";
    private String residenceCity = "Cochabamba";
    
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
                "My programming languages are " + programmingLanguages +"\n" +
                "My residence city " + residenceCity;
    }
    public String ShowName(){
        return "Hi, my name is "+this.name;
    }

    public String getCareer(){
		return "I have studied" + this.career;
    }
    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programmingLanguages;
    }
}