package org.fundacionjala.at13.students;

 public class RaymundoGuaraguara {

    /*
    Raymundo Guaraguara Sansusty
    I like to be called Ray
    31
    Industrial and systems engineering
    Universidad Privada Boliviana
    Python
    Cochabamba
    */
    private String name;
    private String nickName;
    private int age;
    private String career;
    private String university;
    private String programingLanguages;
    private String residenceCity;

    public RaymundoGuaraguara(){
        this.name="Raymundo Guaraguara Sansusty";
        this.nickName="Ray";
        this.age=31;
        this.career="Industrial and systems engineering";
        this.university="Universidad Privada Boliviana";
        this.programingLanguages="Python";
        this.residenceCity="Cochabamba";
    }

    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programingLanguages;
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