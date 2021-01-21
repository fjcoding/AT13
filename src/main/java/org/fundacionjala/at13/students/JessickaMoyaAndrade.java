
package org.fundacionjala.at13.students;

public class JessickaMoyaAndrade{
    /* Full name: Jessicka Moya Andrade
    I like to be called: jess
    Age: 23
    Career: Systems Engineer
    University: Universidad Mayor de San Simon
    Preferred programming languages: java, php, jascript
    Residence city: Cochabamba*/
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
    public String ShowName(){
        return "Hi, my name is "+this.name;
    }
}