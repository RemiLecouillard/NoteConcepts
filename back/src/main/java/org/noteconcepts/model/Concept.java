package org.noteconcepts.model;

import org.noteconcepts.dbomodel.ConceptDBO;
import org.springframework.stereotype.Component;

@Component
public class Concept {

    private String name;

    private String description;

    private double averageNote;

    public Concept() {

    }

    public Concept(String name, String description, double averageNote) {
        this.name = name;
        this.description = description;
        this.averageNote = averageNote;
    }


    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageNote() {
        return averageNote;
    }

    public void setAverageNote(double averageNote) {
        this.averageNote = averageNote;
    }
}
