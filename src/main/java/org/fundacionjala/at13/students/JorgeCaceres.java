package org.fundacionjala.at13.students;
public class JorgeCaceres{
    private String name = "Jorge Caceres Velasco";
    private String nickName = "Jorge";
    private int age = 29;
    private String career = "Electronic Engineer";
    private String university = "San Simon";
    private String programingLanguages = "Java";
    private String residenceCity = "Cochabamba";

    public String ShowName(){
        return "Hi, my name is "+this.name;
    }

    public String ShowNickName(){
        return "I like to be called "+this.nickName;
    }

    public String ShowAge(){
        return "Hi, my name is "+this.age;
    } 

    public String getCareer(){
		return "I have studied" + this.career;
    }

    public String ShowUniversity(){
        return "I studied at "+this.university;
    } 

    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programmingLanguages;
    }

    public String getResidenceCity(){
        return "Currently I live in "+this.residenceCity+".";
    }

    public String showStudentsInformation() {
        return "Hello "+"my name is " + this.name + "\n" +
                "I like to be called '" + this.nickName + "\n" +
                "I am "+ this.age +" years old" + "\n" +
                "I am " + this.career + "\n" +
                "I study at " + this.university+ " university \n" +
                "My programming languages are " + this.programmingLanguages +"\n" +
                "My residence city " + this.residenceCity;
    }
}
