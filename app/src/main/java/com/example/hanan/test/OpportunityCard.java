package com.example.hanan.test;

/**
 * Created by Hanan on 05/09/16.
 */
public class OpportunityCard {

    String tilte;
    String description;
    String numNeeded;
    int people;
    int state;

    public OpportunityCard(String tilte, String description, String numNeeded, int people, int state) {
        this.tilte = tilte;
        this.description = description;
        this.numNeeded = numNeeded;
        this.people = people;
        this.state = state;
    }
}
