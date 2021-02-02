package org.fundacionjala.at13.students;

public class JoelRojas {

    private String name;
    private String nickname;
    private int age;
    private String career;
    private String university;
    private String programingLanguages;
    private String residenceCity;
    private static final int CURRENT_JOEL_AGE = 27;
    private static final int CURRENT_YEAR = 2021;

    public JoelRojas() {
        this.name = "Joel Rodrigo Rojas Roman";
        this.nickname = "Joel";
        this.age = CURRENT_JOEL_AGE;
        this.career = "Systems Engineering";
        this.university = "UMSS";
        this.programingLanguages = "Java";
        this.residenceCity = "Quillacollo, Cochabamba";
    }

    /**
     * Description: The function shows student's nickname.
     * @return a String with a nickname's presentation.
     */
    public String showNickname() {
        return "I like to be called " + this.nickname;
    }

    /**
     * Description: The function shows student's residence city.
     * @return a String with a residence city's presentation.
     */
    public String getResidenceCity() {
        return "Currently I live in " + residenceCity + ".";
    }

    /**
     * Description: The function shows student's information.
     * @return a String with a complete information's presentation.
     */
    public String showStudentsInformation() {
        return "Hello " + "my name is " + name + "\n"
                + "I like to be called " + nickname + "\n"
                + "I am " + age + " years old" + "\n"
                + "I am " + career + "\n"
                + "I study at " + university + " university \n"
                + "My programming languages are " + programingLanguages + "\n"
                + "My residence city " + residenceCity + "\n"
                + "I have born in the year " + (CURRENT_YEAR - age) + ".";
    }

    /**
     * Description: The function shows student's name.
     * @return a String with a greeting and name's presentation.
     */
    public String showName() {
        return "Hi, my name is " + this.name;
    }

    /**
     * Description: The function shows student's career.
     * @return a String with a career's presentation.
     */
    public String getCareer() {
        return "I have studied" + this.career;
    }

    /**
     * Description: The function shows what programming languages student likes.
     * @return a String with a programming languages's presentation.
     */
    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programingLanguages;
    }

    /**
     * Description: The function shows student's age.
     * @return a String with a age's presentation.
     */
    public String showAge() {
        return "Hi, my name is " + this.age;
    }

    /**
     * Description: The function shows student's university.
     * @return a String with a university's presentation.
     */
    public String showUniversity() {
        return "I studied at " + this.university;
    }

    /**
     * Description: The function shows year that student was born.
     * @return a String with a year birth's presentation.
     */
    public String showYearBirth() {
        return "I have born in the year " + (CURRENT_YEAR - age) + ".";
    }
}
