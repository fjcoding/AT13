package org.fundacionjala.at13.students;

class RaymundoGuaraguara {

    /*
    Raymundo Guaraguara Sansusty
    I like to be called Ray
    31
    Industrial and systems engineering
    Universidad Privada Boliviana
    Python
    Cochabamba
    */
    public String getResidenceCity(){
        return "Currently I live in "+residenceCity+".";
    }
    public String ShowNickName(){
        return "I like to be called "+this.nickName;
    }
    
    public String showStudentsInformation() {
        return "Hello "+"my name is " + name + "\n" +
                "I like to be called '" + nickName + "\n" +
                "I am "+ age +" years old" + "\n" +
                "I am " + career + "\n" +
                "I study at " + university+ " university \n" +
                "My programming languages are " + programingLanguages +"\n" +
                "My residence city " + residenceCity;
    }
}