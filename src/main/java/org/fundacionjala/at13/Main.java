package org.fundacionjala.at13;

import org.fundacionjala.at13.students.*;

public class Main {

    public static void main(String[] args) {
        CristianChoque cristian = new CristianChoque();
        DanielaSantaCruz daniela = new DanielaSantaCruz();
        EdsonAnawayaRios edson = new EdsonAnawayaRios();
        GustavoHuanca gustavo = new GustavoHuanca();
        JessickaMoyaAndrade jessicka = new JessickaMoyaAndrade();
        JoelRojas joel = new JoelRojas();
        JorgeCaceres jorge = new JorgeCaceres();
        JuanGonzales juan = new JuanGonzales();
        PaolaAguilar paola = new PaolaAguilar();
        RaymundoGuaraguara raymundo = new RaymundoGuaraguara();
        SaulCaspa saul = new SaulCaspa();
       
        System.out.println(cristian.showStudentsInformation());
        System.out.println(daniela.showStudentsInformation());
        System.out.println(edson.showStudentsInformation());
        System.out.println(gustavo.showStudentsInformation());
        System.out.println(jessicka.showStudentsInformation());
        System.out.println(joel.showStudentsInformation());
        System.out.println(jorge.showStudentsInformation());
        System.out.println(juan.showStudentsInformation());
        System.out.println(paola.showStudentsInformation());
        System.out.println(raymundo.showStudentsInformation());
        System.out.println(saul.showStudentsInformation());

    }
}