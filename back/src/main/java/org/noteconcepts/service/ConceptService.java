package org.noteconcepts.service;

import org.noteconcepts.dbomodel.ConceptDBO;
import org.noteconcepts.model.Concept;
import org.noteconcepts.model.Note;
import org.noteconcepts.repo.ConceptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;

@Service
public class ConceptService {

    @Autowired
    private ConceptRepository _conceptRepository;

    @Autowired
    private NoteService _noteService;

    public List<Concept> getConcept() {
        List<Concept> concepts = new LinkedList<>();
        for(ConceptDBO conceptDBO : _conceptRepository.findAll()) {
            Concept concept = new Concept();
            OptionalDouble note = _noteService.getNotesForConcept(conceptDBO).stream()
                    .mapToDouble(Note::getNote)
                    .average();
            if (note.isPresent()) {
                concept.setAverageNote(note.getAsDouble());
            } else {
                double DEFAULT_AVERAGE_NOTE = 2.5;
                concept.setAverageNote(DEFAULT_AVERAGE_NOTE);
            }
            concept.setName(conceptDBO.getName());
            concept.setDescription(conceptDBO.getDescription());
        }
        return concepts;
    }
}
