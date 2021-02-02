
package org.fundacionjala.at13.students;

public class JessickaMoyaAndrade {
    public static final int CURRENT_YEAR = 2021;
    public static final int CURRENT_AGE = 23;
    private String name = "Jessicka Moya Andrade";
    private String nickName = "Jess";
    private int age = CURRENT_AGE;
    private String career = "Systems Engineering";
    private String university = "UMSS";
    private String programingLanguages = "java, php";
    private String residenceCity = "Cochabamba, Cochabamba";

    public String getCareer() {
        return "I have studied" + this.career;
	}

    public String getResidenceCity() {
        return "Currently I live in " + residenceCity + ".";
    }
    public String showNickName() {
        return "I like to be called " + this.nickName;
    }

    public String showStudentsInformation() {
        return "Hello " + "my name is " + name + "\n"
                + "I like to be called '" + nickName + "\n"
                + "I am " + age + " years old" + "\n"
                + "I am " + career + "\n"
                + "I study at " + university + " university \n"
                + "My programming languages are " + programingLanguages + "\n"
                + "My residence city " + residenceCity + "\n"
                + "I have born in the year " + (CURRENT_YEAR - age) + ".";
    }
    public String showName() {
        return "Hi, my name is " + this.name;
    }
    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programingLanguages;
    }
    public String showAge() {
        return "Hi, my name is " + this.age;
    }
    public String showUniversity() {
        return "I studied at " + this.university;
    }
    public String showYearBirth() {
        return "I have born in the year " + (CURRENT_YEAR - age) + ".";
    }
}