package com.company;

import java.util.ArrayList;

public class Benutzer {
    private String vorName;
    private String nachName;
    private ArrayList<Sport> sport;

    //getters
    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    //setters
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public ArrayList<Sport> getSport() {
        return sport;
    }

    public void setSport(ArrayList<Sport> sport) {
        this.sport = sport;
    }

    //constructor
    public Benutzer(String vorName, String nachName, ArrayList<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    //Metoda calculeaza timpul total petrecut facand sport
    public double kalkuliereGanzeZeit(){
        double summe = 0;
        for(Sport s:this.sport){
            summe+=s.kalkuliereZeit();
        }
        return summe;
    }

    //Metoda calculeaza timpul petrecut facand un sport s
    public double kalkuliereZeitEinSport(Sport s){
        double summeZeit =0;
        for(Sport sports:sport){
            if(s.kalkuliereZeit()==sports.kalkuliereZeit()){
                summeZeit+=s.kalkuliereZeit();
            }
        }
        return summeZeit;
    }

    //Metoda calculeaza in medie timpul petrecut facand fiecare sport
    public double kalkuliereDurchschnittsZeit(){
        double summe = 0;
        for(Sport s: this.sport){
            summe+=s.kalkuliereZeit();
        }
        return summe/sport.size();
    }

}
