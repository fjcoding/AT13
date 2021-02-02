package org.fundacionjala.at13.students;

public class PaolaAguilar {

    private String name;
    private String nickName;
    private int age;
    private String career;
    private String university;
    private String programmingLanguages;
    private String residenceCity;
    public static final int CURRENT_YEAR = 2021;
    public static final int CURRENT_AGE_PAO = 29;

    public PaolaAguilar() {
        this.name = "Paola Ximena Aguilar Quiñones.";
        this.nickName = "Pao";
        this.age = CURRENT_AGE_PAO;
        this.career = "Computer Engineer.";
        this.university = "Universidad de San Francisco Xavier de Chuquisaca.";
        this.programmingLanguages = "PHP and JavaScript.";
        this.residenceCity = "Sucre.";
    }

    /**
     * Description: The function displays residence city.
     *
     * @return a String that shows residence city of Pao.
     */
    public String getResidenceCity() {
        return "Currently I live in " + this.residenceCity + ".";
    }

    /**
     * Description: The function displays the nickName of the person.
     *
     * @return a String that shows how the persons like to be called.
     */
    public String showNickName() {
        return "I like to be called " + this.nickName;
    }

    /**
     * Description: The function displays the name of the person.
     *
     * @return a String that shows the name of the person.
     */
    public String showName() {
        return "Hi, my name is " + this.name;
    }

    /**
     * Description: The function displays all the information of the person.
     *
     * @return a String that shows all the information.
     */
    public String showStudentsInformation() {
        return "Hello " + "my name is " + name + "\n"
                + "I like to be called '" + nickName + "\n"
                + "I am " + age + " years old" + "\n"
                + "I am " + career + "\n"
                + "I study at " + university + " university \n"
                + "My programming languages are " + programmingLanguages + "\n"
                + "My residence city " + residenceCity + "\n"
                + "I have born in the year "
                + (CURRENT_YEAR - CURRENT_AGE_PAO) + ".";
    }

    /**
     * Description: The function displays the carerr of the person.
     *
     * @return a String that shows the carerr.
     */
    public String getCareer() {
        return "I have studied" + this.career;
    }

    /**
     * Description: The function displays favorites programming languages
     * of the person.
     *
     * @return a String that shows favorites programming languages.
     */
    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programmingLanguages;
    }

    /**
     * Description: The function displays the age of the person.
     *
     * @return a String that shows the age.
     */
    public String showAge() {
        return "Hi, my name is " + this.age;
    }

    /**
     * Description: The function displays the University where
     * the person studied.
     *
     * @return a String that shows the University.
     */
    public String showUniversity() {
        return "I studied at " + this.university;
    }

    /**
     * Description: The function displays the Year of birth of the person.
     *
     * @return a String that shows the Year of birth.
     */
    public String showYearBirth() {
        return "I have born in the year "
                + (CURRENT_YEAR - CURRENT_AGE_PAO) + ".";
    }
}
