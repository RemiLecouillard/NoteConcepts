package org.noteconcepts.dbomodel;

import javax.persistence.*;

@Entity
@Table(name = "Note")
public class NoteDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int note;

    private Integer concept;


    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConcept() {
        return concept;
    }

    public void setConcept(Integer concept) {
        this.concept = concept;
    }
}
