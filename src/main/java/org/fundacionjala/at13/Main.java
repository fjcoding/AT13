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
        System.out.println(cristian.showStudentsInformation()+"\n" );
        System.out.println(daniela.showStudentsInformation()+"\n" );
        System.out.println(edson.showStudentsInformation()+"\n" );
        System.out.println(gustavo.showStudentsInformation()+"\n" );
        System.out.println(jessicka.showStudentsInformation()+"\n" );
        System.out.println(joel.showStudentsInformation()+"\n" );
        System.out.println(jorge.showStudentsInformation()+"\n" );
        System.out.println(juan.showStudentsInformation()+"\n" );
        System.out.println(paola.showStudentsInformation()+"\n" );
        System.out.println(raymundo.showStudentsInformation()+"\n" );
        System.out.println(saul.showStudentsInformation()+"\n" );
    }
}