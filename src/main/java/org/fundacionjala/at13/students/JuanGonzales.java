package org.fundacionjala.at13.students;
public class JuanGonzales {

    private String name;
    private String nickName;
    private int age;
    private String career;
    private String university;
    private String programingLanguages;
    private String residenceCity;
    public static final int CURRENT_YEAR = 2021;
    public static final int CURRENT_AGE = 31;

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
     * Description: The function displays the person's full
     * personal information.
     *
     * @return a String that shows this person's complete information.
     */
    public JuanGonzales() {
        this.name = "Juan Pablo Gonzales Alvarado";
        this.nickName = "Juampi";
        this.age = CURRENT_YEAR;
        this.career = "Computer Engineer";
        this.university = "Juan Misael Saracho";
        this.programingLanguages = "Java and Dart";
        this.residenceCity = "Tarija";
    }

    /**
     * Description: The function displays the person's full
     * personal information.
     *
     * @return a String that shows this person's complete information.
     */
    public String showStudentsInformation() {
        return "Hello my name is " + name + "\n"
        + "I like to be called " + nickName + "\n"
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
     * Description: The function displays programming languages
     * that this person likes.
     *
     * @return a String that shows programming languages this person likes
     */
    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programingLanguages;
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
        return "I have born in the year " + (CURRENT_YEAR - age) + " . ";
    }
}
