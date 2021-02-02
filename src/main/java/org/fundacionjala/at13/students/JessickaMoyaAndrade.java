
package org.fundacionjala.at13.students;

public class JessickaMoyaAndrade {
    public static final int CURRENT_YEAR = 2021;
    public static final int CURRENT_AGE = 23;
    private String name = "Jessicka Moya Andrade";
    private String nickName = "Jess";
    private int age = CURRENT_AGE;
    private String career = "Systems Engineering";
    private String university = "UMSS";
    private String programingLanguages = "java, php";
    private String residenceCity = "Cochabamba, Cochabamba";

    /**
     * Description: The function displays the student's career.
     *
     * @return a String that shows student's career.
     */
    public String getCareer() {
        return "I have studied" + this.career;
    }

    /**
     * Description: The function displays the student's residence city.
     *
     * @return a String that shows student's recidence city.
     */
    public String getResidenceCity() {
        return "Currently I live in " + residenceCity + ".";
    }

    /**
     * Description: The function displays the student's nick name.
     *
     * @return a String that shows student's nick name.
     */
    public String showNickName() {
        return "I like to be called " + this.nickName;
    }

    /**
     * Description: The function displays the full information
     *of a student.
     * @return a String that shows the full information
     * os a student.
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
     * Description: The function displays the student's name.
     *
     * @return a String that shows student's name.
     */
    public String showName() {
        return "Hi, my name is " + this.name;
    }

    /**
     * Description: The function displays programming languages
     * that this student likes.
     *
     * @return a String that shows programming languages this student likes.
     */
    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programingLanguages;
    }

    /**
     * Description: The function displays the student's age.
     *
     * @return a String that shows student's age.
     */
    public String showAge() {
        return "Hi, my name is " + this.age;
    }

    /**
     * Description: The function displays the name of the university
     *in which the student study.
     * @return a String that shows the name of the university
     * in which the student study.
     */
    public String showUniversity() {
        return "I studied at " + this.university;
    }

    /**
     * Description: The function displays the student's year birth.
     *
     * @return a String that shows the student's year birth.
     */
    public String showYearBirth() {
        return "I have born in the year " + (CURRENT_YEAR - age) + ".";
    }
}
