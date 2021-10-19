package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void optionenSport(){ //Optiunile de sporturi
        System.out.println(ANSI_BLUE+"1. Baschet");
        System.out.println("2. Fotbal");
        System.out.println("3. Curse cu obstacole");
        System.out.println("4. Saritura in inaltime");
        System.out.println("5. Exit");
    }

    public Benutzer readBenutzer(){ //meniul de citire a unui nou utilizator
        Scanner read = new Scanner(System.in);
        ArrayList<Sport> sports = new ArrayList<Sport>();
        System.out.println(ANSI_BLUE+"Prenume: ");
        String firstName = read.nextLine();
        System.out.println(ANSI_BLUE+"Nume de familie: ");
        String lastName = read.nextLine();

        Mannschaftssport basketball =new Basketball();
        Mannschaftssport fussball =new Fussball();
        Leichtathletik hindernislauf=new Hindernislauf();
        Leichtathletik hochsprung=new Hochsprung();
        System.out.println(ANSI_PURPLE+"Introduceti sporturile preferate: ");
        optionenSport();
        int option = read.nextInt();
        while(option!=5){
            if(option==1){
                sports.add(basketball);
                System.out.println(ANSI_GREEN+"Optiune adaugata");
                optionenSport();
                option = read.nextInt();

            }
            else
                if(option==2){
                    sports.add(fussball);
                    System.out.println(ANSI_GREEN+"Optiune adaugata");
                    optionenSport();
                    option = read.nextInt();

                }
                else
                    if(option==3){
                        sports.add(hindernislauf);
                        System.out.println(ANSI_GREEN+"Optiune adaugata");
                        optionenSport();
                        option = read.nextInt();

                    }
                    else
                        if(option==4){
                            sports.add(hochsprung);
                            System.out.println(ANSI_GREEN+"Optiune adaugata");
                            optionenSport();
                            option = read.nextInt();

                        }
                        else {
                            System.out.println(ANSI_RED + "Optiune invalida");
                            optionenSport();
                            option = read.nextInt();
                        }

        }

        return new Benutzer(firstName,lastName,sports);
    }

    public void optionsMenu(){ //optiunile disponibile
        System.out.println(ANSI_BLUE+"Ce doriti sa calculati?  ");
        System.out.println("1. Timpul necesar pentru toate sporturile ");
        System.out.println("2. Timpul necesar pentru un anumit sport ");
        System.out.println("3. Timpul in medie pentru fiecare sport ");
        System.out.println("4. Exit ");
    }

    public void options(){ //meniul principal de afisare a calculelor din optiunile disponibile
        Mannschaftssport basketball =new Basketball();
        Mannschaftssport fussball =new Fussball();
        Leichtathletik hindernislauf=new Hindernislauf();
        Leichtathletik hochsprung=new Hochsprung();

        Scanner read = new Scanner(System.in);

        Benutzer benutzer = readBenutzer();
        String firstName = benutzer.getVorName();
        String lastName = benutzer.getNachName();
        System.out.println(ANSI_YELLOW+"Buna ziua, "+firstName+" "+lastName+"!");
        optionsMenu();
        int option = read.nextInt();
        while(option!=4){
            if(option==1){
                System.out.println(ANSI_PURPLE+benutzer.kalkuliereZeit());
                optionsMenu();
                option = read.nextInt();
            }
            else
                if(option==2){
                    System.out.println(ANSI_BLUE+"Alegeti sportul: ");
                    optionenSport();
                    int optionSport = read.nextInt();
                    while(optionSport!=5){
                    if(optionSport==1){
                        System.out.println(ANSI_BLUE+"Timpul necesar pentru acest sport este: "+benutzer.kalkuliereZeit(basketball));
                        optionenSport();
                        optionSport = read.nextInt();
                    }
                    else
                        if (optionSport == 2) {
                            System.out.println(ANSI_BLUE + "Timpul necesar pentru acest sport este: " + benutzer.kalkuliereZeit(fussball));
                            optionenSport();
                            optionSport = read.nextInt();
                        } else
                            if (optionSport == 3) {
                                System.out.println(ANSI_BLUE+"Timpul necesar pentru acest sport este: "+benutzer.kalkuliereZeit(hindernislauf));
                                optionenSport();
                                optionSport = read.nextInt();
                            }
                            else
                                if(optionSport==4){
                                    System.out.println(ANSI_BLUE+"Timpul necesar pentru acest sport este: "+benutzer.kalkuliereZeit(hochsprung));
                                    optionenSport();
                                    optionSport = read.nextInt();
                                }
                                else{
                                    System.out.println(ANSI_RED+"Alegeti o optiune existenta");
                                    optionenSport();
                                    optionSport = read.nextInt();
                                }

                    }
                    optionsMenu();
                    option = read.nextInt();
                }
                else
                    if(option==3){
                        System.out.println(ANSI_BLUE+"Timpul in medie pentru fiecare sport este: "+benutzer.kalkuliereDurchschnittsZeit());
                        optionsMenu();
                        option = read.nextInt();
                    }

            while(option>4||option<1){
                System.out.println(ANSI_RED+"Alegeti o optiune existenta");
                optionsMenu();
                option = read.nextInt();
            }
        }
    }


}
