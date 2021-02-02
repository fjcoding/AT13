package org.fundacionjala.at13.students;

public class JoelRojas{

    private String name;
    private String nickname;
    private int age;
    private String career;
    private String university;
    private String programingLanguages;
    private String residenceCity;

    public JoelRojas() {
        this.name = "Joel Rodrigo Rojas Roman";
        this.nickname = "Joel";
        this.age = 27;
        this.career = "Systems Engineering";
        this.university = "UMSS";
        this.programingLanguages = "Java";
        this.residenceCity = "Quillacollo, Cochabamba";
    }

    public String showNickname() {
        return "I like to be called " + this.nickname;
    }

    public String getResidenceCity() {
        return "Currently I live in " + residenceCity + ".";
    }
    
    public String showStudentsInformation() {
        return "Hello "+"my name is " + name + "\n" +
                "I like to be called '" + nickname + "\n" +
                "I am "+ age +" years old" + "\n" +
                "I am " + career + "\n" +
                "I study at " + university+ " university \n" +
                "My programming languages are " + programingLanguages +"\n" +
                "My residence city " + residenceCity +"\n" +
                "I have born in the year "+(2021-age)+".";
    }

    public String showName() {
        return "Hi, my name is " + this.name;
    }

    public String getCareer() {
		return "I have studied" + this.career;
    }

    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programingLanguages;
    }

    public String showAge() {
        return "Hi, my name is " + this.age;
    } 

    public String ShowUniversity() {
        return "I studied at " + this.university;
    }

    public String showYearBirth() {
        return "I have born in the year " + (2021-age) + ".";
    }
}
