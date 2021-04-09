package org.noteconcepts.service;

import org.noteconcepts.dbomodel.ConceptDBO;
import org.noteconcepts.dbomodel.NoteDBO;
import org.noteconcepts.model.Note;
import org.noteconcepts.repo.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository _noteRepository;

    public void addNote(Note note) {
        NoteDBO noteDBO = new NoteDBO();
        noteDBO.setNote(note.getNote());
        noteDBO.setConcept(note.getConcept());
        _noteRepository.save(noteDBO);
    }

    public List<Note> getNotesForConcept(ConceptDBO conceptDBO) {
        List<Note> notes = new LinkedList<>();
        for (NoteDBO n : _noteRepository.findByConcept(conceptDBO.getId())) {
            notes.add(new Note(n.getConcept(), n.getNote()));
        }
        return notes;
    }
}
