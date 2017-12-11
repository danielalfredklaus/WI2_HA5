package ch.uzh.ifi.imrg.wi2.projectTemplate.repository;

import ch.uzh.ifi.imrg.wi2.projectTemplate.persistence.Auftrag;
import org.springframework.data.repository.CrudRepository;

public interface AuftragRepository extends CrudRepository<Auftrag,Long> {

    Auftrag findByAuftragsName(String auftragsName);

}
