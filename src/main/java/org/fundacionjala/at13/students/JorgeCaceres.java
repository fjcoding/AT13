package org.fundacionjala.at13.students;
public class JorgeCaceres{

/*Jorge Rodrigo Caceres Velasco
Jorge
29
Electronic engineer
San Simon University
Java
Cochabamba*/
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
