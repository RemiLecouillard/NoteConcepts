package org.noteconcepts.model;

public class Note {

    private int concept;

    private int note;

    public Note() {

    }

    public Note(int concept, int note) {
        this.concept = concept;
        this.note = note;
    }


    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getConcept() {
        return concept;
    }

    public void setConcept(int concept) {
        this.concept = concept;
    }
}
