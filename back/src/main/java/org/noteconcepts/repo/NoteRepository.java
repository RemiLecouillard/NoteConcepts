package org.noteconcepts.repo;

import org.noteconcepts.dbomodel.NoteDBO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends CrudRepository<NoteDBO, Integer> {
    List<NoteDBO> findByConcept(Integer concept);
}
