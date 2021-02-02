package org.fundacionjala.at13.students;

/**
 * This Class shows Student information.
 * @author: Jorge Rodrigo Caceres Velasco.
 * @version: 02/01/2021.
 */
 public class JorgeCaceres {
    /*
    Jorge Rodrigo Caceres Velasco
    I like to be called Jorge
    29
    Electronics engineering
    Universidad Mayor de San Simon
    Java
    Cochabamba
    */
    /**
     * Description: The parameter creates the varible name.
     * @param String name.
     */
    private String name;
    /**
     * Description: The parameter creates the varible nickName.
     * @param String nickName.
     */
    private String nickName;
    /**
     * Description: The parameter creates the varible age.
     * @param int age.
     */
    private int age;
    /**
     * Description: The parameter creates the varible career.
     * @param String career.
     */
    private String career;
    /**
     * Description: The parameter creates the varible university.
     * @param String university.
     */
    private String university;
    /**
     * Description: The parameter creates the varible programingLanguages.
     * @param String programingLanguages.
     */
    private String programingLanguages;
    /**
     * Description: The parameter creates the varible residenceCity.
     * @param String residenceCity.
     */
    private String residenceCity;
    /**
     * Description: The parameter creates the varible CURRENT_YEAR.
     * @param int CURRENT_YEAR.
     */
    public static final int CURRENT_YEAR = 2021;
    /**
     * Description: The parameter creates the varible CURRENT_JORGE_AGE.
     * @param int CURRENT_JORGE_AGE.
     */
    public static final int CURRENT_JORGE_AGE = 29;
    /**
     * Description: Constructor class.
     */
    public JorgeCaceres() {
        this.name = "Jorge Rodrigo Caceres Velasco";
        this.nickName = "Ray";
        this.age = CURRENT_JORGE_AGE;
        this.career = "Electronics engineering";
        this.university = "Universidad Mayor de San Simon";
        this.programingLanguages = "Java";
        this.residenceCity = "Cochabamba";
    }

    /**
     * Description: The function displays programming languages
     * that this person likes.
     *
     * @return a String that shows programming languages this person likes
     */
    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programingLanguages;
    }

    /**
     * Description: The function displays the residence city
     * of this person.
     *
     * @return a String that shows this person's current residence city.
     */
    public String getResidenceCity() {
        return "Currently I live in " + residenceCity + ".";
    }

    /**
     * Description: The function displays the person's nickname.
     *
     * @return a String that shows this person's nickname.
     */
    public String showNickName() {
        return "I like to be called " + this.nickName;
    }

    /**
     * Description: The function displays the person's full
     * personal information.
     *
     * @return a String that shows this person's complete information.
     */
    public String showStudentsInformation() {
        return "Hello " + "my name is " + name + "\n"
                + "I like to be called '" + nickName + "\n"
                + "I am " + age + " years old" + "\n"
                + "I am " + career + "\n"
                + "I study at " + university + " university \n"
                + "My programming languages are " + programingLanguages + "\n"
                + "My residence city " + residenceCity + "\n"
                + "I have born in the year " + (CURRENT_YEAR - age) + ".";
    }

    /**
     * Description: The function displays the person's name.
     *
     * @return a String that shows this person's name.
     */
    public String showName() {
        return "Hi, my name is " + this.name;
    }

    /**
     * Description: The function displays the person's career.
     *
     * @return a String that shows this person's career.
     */
    public String getCareer() {
        return "I have studied" + this.career;
    }

    /**
     * Description: The function displays the person's age.
     *
     * @return a String that shows this person's age.
     */
    public String showAge() {
        return "Hi, my name is " + this.age;
    }

    /**
     * Description: The function displays the person's university.
     *
     * @return a String that shows this person's university.
     */
    public String showUniversity() {
        return "I studied at " + this.university;
    }

    /**
     * Description: The function displays the person's year of birth.
     *
     * @return a String that shows this person's year of birth.
     */
    public String showYearBirth() {
        return "I have born in the year " + (CURRENT_YEAR - age) + ".";
    }
}
