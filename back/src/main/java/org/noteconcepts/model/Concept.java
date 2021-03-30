package org.noteconcepts.model;

import org.springframework.stereotype.Component;

@Component
public class Concept {

    private String name;

    private String description;

    public Concept() {

    }

    public Concept(String name, String description) {
        this.name = name;
        this.description = description;
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
}
