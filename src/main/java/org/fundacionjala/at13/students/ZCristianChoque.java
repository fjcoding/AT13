
package org.fundacionjala.at13.students;

public class ZCristianChoque {

    /**Description.
     * Variable name of type String for the class
     */
    private String name;
    /**Description.
     * Variable nickName of type String for the class
     */
    private String nickName;
    /**Description.
     * Variable age of type int for the class
     */
    private int age;
    /**Description.
     * Variable career of type String for the class
     */
    private String career;
    /**Description.
     * Variable university of type String for the class
     */
    private String university;
    private String programingLanguages;
    private String residenceCity;

    /** DESCRIPTION.
     * A default constructor for the class
     */
    public ZCristianChoque(){
        this.name="Cristian Felix Choque Quispe";
        this.nickName="Cristian";
        this.age=30;
        this.career="Electronic Engineering";
        this.university="UMSA";
        this.programingLanguages="c++";
        this.residenceCity="La Paz";
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
