package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {
        ArrayList<Sport> favoriteSport = new ArrayList<Sport>();
        Mannschaftssport basketball = new Basketball();
        Mannschaftssport football = new Fussball();

        favoriteSport.add(basketball);
        favoriteSport.add(football);

        Benutzer benutzer = new Benutzer("Amalia","Blidar",favoriteSport);
        assertEquals(benutzer.kalkuliereZeit(),120);

    }

    @Test
    void testKalkuliereZeit() {
        ArrayList<Sport> favoriteSport = new ArrayList<Sport>();
        Mannschaftssport basketball = new Basketball();
        Mannschaftssport football = new Fussball();

        favoriteSport.add(basketball);
        favoriteSport.add(football);

        Benutzer benutzer = new Benutzer("Amalia","Blidar",favoriteSport);
        assertEquals(benutzer.kalkuliereZeit(basketball),55);
    }

    @Test
    void kalkuliereDurchschnittsZeit() {
        ArrayList<Sport> favoriteSport = new ArrayList<Sport>();
        Mannschaftssport basketball = new Basketball();
        Mannschaftssport football = new Fussball();

        favoriteSport.add(basketball);
        favoriteSport.add(football);

        Benutzer benutzer = new Benutzer("Amalia","Blidar",favoriteSport);
        assertEquals(benutzer.kalkuliereDurchschnittsZeit(),60);
    }
}