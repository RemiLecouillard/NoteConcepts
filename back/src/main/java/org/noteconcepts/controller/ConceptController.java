package org.noteconcepts.controller;

import org.noteconcepts.dbomodel.ConceptDBO;
import org.noteconcepts.dbomodel.NoteDBO;
import org.noteconcepts.model.Concept;
import org.noteconcepts.model.Note;
import org.noteconcepts.repo.ConceptRepository;
import org.noteconcepts.repo.NoteRepository;
import org.noteconcepts.service.ConceptService;
import org.noteconcepts.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/concepts")
public class ConceptController {


    @Autowired
    private ConceptService _conceptService;

    @Autowired
    private NoteService _noteService;

    @GetMapping
    public @ResponseBody List<Concept> getConcepts() {
        return _conceptService.getConcept();
    }

    @PostMapping("/{id}/notes")
    public void addNote(@PathVariable("id") int id, @RequestBody Note note) {
        _noteService.addNote(note);
    }
}
