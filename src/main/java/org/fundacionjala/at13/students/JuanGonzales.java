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

String name = "Juan Pablo Gonzales Alvarado";
String nickName = "Juampi";
int age = 29;
String career = "Computer Engineer";
String university = "Juan Misael Saracho";
String programingLanguage = "Java and Dart";
String city = "Tarija";


public String showStudentsInformation() {
    return "Hello "+"my name is " + name + "\n" +
            "I like to be called '" + nickName + "\n" +
            "I am "+ age +" years old" + "\n" +
            "I am " + career + "\n" +
            "I study at " + university+ " university \n" +
            "My programming languages are " + programingLanguage +"\n" +
            "My residence city " + city;
}

}