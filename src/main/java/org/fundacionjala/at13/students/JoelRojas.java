package org.fundacionjala.at13.students;

public class JoelRojas{

    private String name;
    private String nickName;
    private int age;
    private String career;
    private String university;
    private String programingLanguages;
    private String residenceCity;

    public JoelRojas(){
        this.name="Joel Rodrigo Rojas Roman";
        this.nickName="Joel";
        this.age=27;
        this.career="Systems Engineering";
        this.university="UMSS";
        this.programingLanguages="Java";
        this.residenceCity="Quillacollo, Cochabamba";
    }

    public String ShowNickName(){
        return "I like to be called "+this.nickName;
    }

    public String getResidenceCity(){
        return "Currently I live in "+residenceCity+".";
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
