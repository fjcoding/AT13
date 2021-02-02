package org.fundacionjala.at13.students;
public class SaulCaspa {

    /*Saul Caspa Miranda
    I like to be called just Saul
    26
    Systems engineering
    Universidad Mayor de San Simon
    Java, php, python
    Cochabamba*/

    /**
     * The "name" of this student.
     */
    private String name;
    /**
     * The "nickname "of this student.
     */
    private String nickName;
    /**
     * The "age" of this student.
     */
    private final int age = 26;
    /**
     * The "career" of this student.
     */
    private String career;
    /**
     * The "university" of this student.
     */
    private String university;
    /**
     * The favourite programming languages of this student.
     */
    private String programmingLanguages;
    /**
     * The "residenceCity" of this student.
     */
    private String residenceCity = "Cochabamba";
    /**
     * The "currentYear".
     */
    private final int currentYear = 2021;
    /**
     * Class SaulCaspa contains the information for this student.
     */
    public SaulCaspa() {
        this.name = "Saul Caspa Miranda";
        this.nickName = "Saul";
        this.career = "Systems Engineering";
        this.residenceCity = "Cochabamba";
        this.university = "Universidad Mayor de San Simon";
        this.programmingLanguages = "Java, php, python";
    }
    /**
     * @return the residence city.
     */
    public final String getResidenceCity() {
        return "Currently I live in " + this.residenceCity + ".";
    }
    /**
     * @return the nickname.
     */
    public final String showNickName() {
        return "I like to be called " + this.nickName;
    }
    /**
     * @return all student information.
     */
    public final String showStudentsInformation() {
        return "Hello " + "my name is " + name + "\n"
        + "I like to be called " + nickName + "\n"
        + "I am " + age + " years old" + "\n"
        + "I am " + career + "\n"
        + "I study at " + university + " university \n"
        + "My programming languages are " + programmingLanguages + "\n"
        + "My residence city " + residenceCity + "\n"
        + "I have born in the year " + (currentYear - this.age) + ".";
    }
    /**
     * @return name.
     */
    public final String showName() {
        return "Hi, my name is " + this.name;
    }
    /**
     * @return favourite programming language.
     */
    public final String showProgramingLanguage() {
        return "I like the programming languages " + this.programmingLanguages;
    }
    /**
     * @return age.
     */
    public final String showAge() {
        return "Hi, my name is " + this.age;
    }
    /**
     * @return student university.
     */
    public final String showUniversity() {
        return "I studied at " + this.university;
    }
    /**
     * @return student year of birth.
     */
    public final String showYearBirth() {
        return "I have born in the year " + (currentYear - this.age) + ".";
    }
}
