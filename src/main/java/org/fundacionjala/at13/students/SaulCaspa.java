package org.fundacionjala.at13.students;
public class SaulCaspa{

    /*Saul Caspa Miranda
    I like to be called just Saul
    26
    Systems engineering
    Universidad Mayor de San Simon
    Java, php, python
    Cochabamba*/

    private String name;
    private String nickName;
    private int age;
    private String career;
    private String university;
    private String programmingLanguages;
    private String residenceCity;

    public SaulCaspa(){
        this.name="Saul Caspa Miranda";
        this.preferredName="Saul";
        this.age=26;
        this.career="Systems Engineering";
        this.university="Universidad Mayor de San Simon";
        this.programmingLanguagesList="Java, php, python";
    }
    public String getResidenceCity(){
        return "Currently I live in "+residenceCity+".";
    }
}
