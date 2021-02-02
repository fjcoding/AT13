package org.fundacionjala.at13.students;
public class GustavoHuanca {
   private String name;
   private String nickName;
   private final int currentAge = 27;
   private int age;
   private String career;
   private String university;
   private String programingLanguages;
   private String residenceCity;
   private final int currentYear = 2021;

   public GustavoHuanca() {
       this.name = "Gustavo Zacarias Huanca Alconz";
       this.nickName = "Gus";
       this.age = currentAge;
       this.career = "Physics";
       this.university = "UMSS";
       this.programingLanguages = "C# and Fortran";
       this.residenceCity = "Cercado, Cochabamba";
   }
    /**
     * @return String with person's residence cCity
     */
   public String setResidenceCity() {
      return "Currently I live in " + residenceCity + ".";
   }
    /**
     * @return String with person's nickname
     */
   public String showNickName() {
      return "I like to be called" + this.nickName;
   }
    /**
     * @return String with person's information
     */
   public String showStudentsInformation() {
      return "Hello " + "my name is " + name + "\n"
      + "I like to be called '" + nickName + "\n"
      + "I am " + age + " years old" + "\n"
      + "I am " + career + "\n"
      + "I study at " + university + " university \n"
      + "My programming languages are " + programingLanguages + "\n"
      + "My residence city " + residenceCity + "\n"
      + "I have born in the year " + (currentYear - age) + ".";
   }
   /**
     * @return String with person's name
     */
   public String showName() {
      return "Hi, my name is " + this.name;
   }
   /**
     * @return String with person's career
     */
   public String showCareer() {
      return "I have studied" + this.career;
   }
   /**
     * @return String with person's programming language
     */
   public String showProgramingLanguage() {
      return "I like the programming languages " + this.programingLanguages;
   }
   /**
     * @return String with person's university.
     */
   public String showUniversity() {
      return "I studied at " + this.university;
   }
   /**
     * @return String with person's age.
     */
    public String showAge() {
      return "Hi, my age is " + this.age;
   }
   /**
     * @return String with person's year birth.
     */
   public String showYearBirth() {
      return "I have born in the year " + (currentYear - age) + ".";
   }
}
