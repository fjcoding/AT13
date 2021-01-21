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
                "My residence city " + residenceCity;
    }

}