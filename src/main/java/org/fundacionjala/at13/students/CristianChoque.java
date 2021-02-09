
package org.fundacionjala.at13.students;

public class CristianChoque {

    private String name;
    private String nickName;
    private int age;
    private String career;
    private String university;
    private String programingLanguages;
    private String residenceCity;
    private final int thisYear = 2021;
    private final int ageStudent = 30;

    /** DESCRIPTION.
     * A default constructor for the class
     */
    public CristianChoque() {
        this.name = "Cristian Felix Choque Quispe";
        this.nickName = "Cristian";
        this.age = ageStudent;
        this.career = "Electronic Engineering";
        this.university = "UMSA";
        this.programingLanguages = "c++";
        this.residenceCity = "La Paz";
    }
    /** DESCRIPTION.
     * method for to get residence of city
     * @return a string with the date of the residence
     */
    public String getResidenceCity() {
        return "Currently I live in " + residenceCity + ".";
    }
    /** DESCRIPTION.
     * method for to get or to show nick name
     * @return a string with the nickName
     */
    public String showNickName() {
        return "I like to be called " + this.nickName;
    }
    /** DESCRIPTION.
     * method for to get all information of the Student
     * @return a string with the all dates of the Student
     */
    public String showStudentsInformation() {
        return "Hello " + "my name is " + name + "\n"
                 + "I like to be called " + nickName + "\n"
                 + "I am " + age + " years old" + "\n"
                 + "I am " + career + "\n"
                 + "I study at " + university + " university \n"
                 + "My programming languages are " + programingLanguages + "\n"
                 + "My residence city " + residenceCity + "\n"
                 + "I have born in the year " + (thisYear - age) + ".";
    }
    /** DESCRIPTION.
     * method for to get name
     * @return a string with the name of the student
     */
    public String showName() {
        return "Hi, my name is " + this.name;
    }
    /** DESCRIPTION.
     * method for to get career
     * @return a string with the career of the student
     */
    public String getCareer() {
        return "I have studied" + this.career;
    }
    /** DESCRIPTION.
     * method for to get favorite programing language of the student
     * @return a string with the favorite programing language of the student
     */
    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programingLanguages;
    }
    /** DESCRIPTION.
     * method for to get age of student
     * @return a string with the age of the student
     */
    public String showAge() {
        return "Hi, my name is " + this.age;
    }
    /** DESCRIPTION.
     * method for to get university where studied
     * @return a string with the university of the student
     */
    public String showUniversity() {
        return "I studied at " + this.university;
    }
    /** DESCRIPTION.
     * method for to get year birth of the student
     * @return a string with the year that born
     */
    public String showYearBirth() {
        return "I have born in the year " + (thisYear - age) + ".";
    }
}
