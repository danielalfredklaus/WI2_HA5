package ch.uzh.ifi.imrg.wi2.projectTemplate.service;

import ch.uzh.ifi.imrg.wi2.projectTemplate.persistence.Auftrag;
import ch.uzh.ifi.imrg.wi2.projectTemplate.repository.AuftragRepository;
import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

@Named("Reparaturofferteerstellen")
public class Reparaturofferteerstellen implements JavaDelegate{

    @Autowired
    AuftragRepository auftragRepository;

    @Override
    public void execute(DelegateExecution de) throws Exception {
            //Dummy Implementierung ist einfach immer 300 Fr.

        Auftrag auftrag = auftragRepository.findByAuftragsName((String) de.getVariable("auftragsName"));
        auftrag.setKosten(300);//Anstatt dass durch eine API-Anfrage abgefragt wird, wieviel das Teil kostet.
        de.setVariable("offertenkosten", 300);
        System.out.println("Offertenkosten hinzugefügt!");


        auftragRepository.save(auftrag);

    }
}
