package org.fundacionjala.at13.students;
public class SaulCaspa{

    private String name;
    private String nickName;
    private int age;
    private String career;
    private String university;
    private String programmingLanguages;
    private String residenceCity;

    public SaulCaspa(){
        this.name="Saul Caspa Miranda";
        this.nickName="Saul";
        this.age=26;
        this.career="Systems Engineering";
        this.university="Universidad Mayor de San Simon";
        this.programmingLanguages="Java, php, python";
    }
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
    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programmingLanguages;
    }
    public String ShowAge(){
        return "Hi, my name is "+this.age;
    } 
}
