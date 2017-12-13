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
            //Offertenbetrag entspricht Kosten des kaputten teils plus 100Fr. pauschal
            //Dummy Implementierung ist einfach immer 300 Fr.
        Auftrag auftrag = new Auftrag();
        auftrag.setAuftragsName((String) de.getVariable("auftragsName"));
        auftrag.setKaputtesTeil((Integer) de.getVariable("kaputtesTeil"));
        auftrag.setSelbstverschuldet((Integer) de.getVariable("selbstverschuldet"));

        auftrag.setKosten(300); //Anstatt dass durch eine API-Anfrage abgefragt wird, wieviel das Teil kostet.
        System.out.println("Stored!");


        auftragRepository.save(auftrag);

    }
}
