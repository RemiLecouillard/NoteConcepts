package org.noteconcepts.repo;

import org.noteconcepts.dbomodel.ConceptDBO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConceptRepository extends CrudRepository<ConceptDBO, Integer> {

}
