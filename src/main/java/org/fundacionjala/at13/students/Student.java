package org.fundacionjala.at13.students;

public class Student{

    private String name;
    private String nickName;
    private int age;
    private String career;
    private String university;
    private String programmingLanguages;
    private String residenceCity;
   
    public String ShowName(){
        return "Hi, my name is "+this.name;
    }

    public String ShowNickName(){
        return "I like to be called "+this.nickName;
    }

    public String ShowAge(){
        return "My age is "+this.age;
    } 

    public String getCareer(){
		return "I have studied " + this.career;
    }

    public String ShowUniversity(){
        return "In the university "+this.university;
    }

    public String showProgramingLanguage() {
        return "I like the programming languages " + this.programmingLanguages;
    }

    public String showResidenceCity(){
        return "Currently I live in "+this.residenceCity+".";
    }

    public String showStudentsInformation() {
        return  "\n---------------------------------------------\n"+
                ShowName() + "\n" +
                ShowNickName() + "\n" +
                ShowAge() + "\n" +
                getCareer() + "\n" +
                ShowUniversity() + "\n" +
                showProgramingLanguage() + "\n" +
                showResidenceCity() + "\n" +
                "---------------------------------------------";
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setCareer(String career) {
        this.career = career;
    }

    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getProgrammingLanguages() {
        return this.programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public String getResidenceCity() {
        return this.residenceCity;
    }

    public void setResidenceCity(String residenceCity) {
        this.residenceCity = residenceCity;
    }
    
}