package org.fundacionjala.at13.students;
public class JuanGonzales{
/**
 * -Juan Pablo Gonzalgues Alvarado
-I like to be called juampi
-29 years old
-Ing. Informatico
-Juan Misael Saracho University
-preferred programming languages: Java y Dart
-Tarija

 */
    public String getResidenceCity(){
        return "Currently I live in "+residenceCity+".";
    }

    private String name = "Juan Pablo Gonzales Alvarado";
    private String nickName = "Juampi";
    private int age = 29;
    private String career = "Computer Engineer";
    private String university = "Juan Misael Saracho";
    private String programingLanguages = "Java and Dart";
    private String residenceCity = "Tarija";

    public String showStudentsInformation() {
        return "Hello "+"my name is " + name + "\n" +
                "I like to be called '" + nickName + "\n" +
                "I am "+ age +" years old" + "\n" +
                "I am " + career + "\n" +
                "I study at " + university+ " university \n" +
                "My programming languages are " + programingLanguages +"\n" +
                "My residence city " + residenceCity +"\n" +
                "I have born in the year "+(2021-age)+".";
    }

    public String ShowName(){
        return "Hi, my name is "+this.name;
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
    public String ShowUniversity(){
        return "I studied at "+this.university;
    }
    public String showYearBirth(){
        return "I have born in the year "+(2021-age)+".";
    }
}