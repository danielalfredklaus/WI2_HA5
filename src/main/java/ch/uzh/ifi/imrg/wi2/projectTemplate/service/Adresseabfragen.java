package ch.uzh.ifi.imrg.wi2.projectTemplate.service;


import ch.uzh.ifi.imrg.wi2.projectTemplate.persistence.Auftrag;
import ch.uzh.ifi.imrg.wi2.projectTemplate.repository.AuftragRepository;
import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import sun.rmi.runtime.Log;

@Named("Adresseabfragen")
public class Adresseabfragen implements JavaDelegate{


    @Autowired
    AuftragRepository auftragRepository;


    @Override
    public void execute(DelegateExecution de) throws Exception {
        Auftrag auftrag = auftragRepository.findByAuftragsName((String) de.getVariable("auftragsName"));
        System.out.println("Adresse wird gesetzt für: " + auftrag.getAuftragsName());

        auftrag.setAdresse("Muster Mustermann, Musterstrasse 10, 8001 MusterStadt");

        System.out.println("Adresse gesetzt!");

        String adresse = new String();
        de.setVariable("adresse","Muster Mustermann, Musterstrasse 10, 8001 MusterStadt");

        auftragRepository.save(auftrag);


    }


}
