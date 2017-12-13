package ch.uzh.ifi.imrg.wi2.projectTemplate.service;

import ch.uzh.ifi.imrg.wi2.projectTemplate.persistence.Auftrag;
import ch.uzh.ifi.imrg.wi2.projectTemplate.repository.AuftragRepository;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;

@Named("Auftragspeichern")
public class Auftragspeichern implements JavaDelegate {

    @Autowired
    AuftragRepository auftragRepository;

    @Override
    public void execute(DelegateExecution de) throws Exception {

        Auftrag auftrag = new Auftrag();
        auftrag.setAuftragsName((String) de.getVariable("auftragsName"));
        auftrag.setKaputtesTeil((Integer) de.getVariable("kaputtesTeil"));
        auftrag.setSelbstverschuldet((Integer) de.getVariable("selbstverschuldet"));

        auftragRepository.save(auftrag);

        System.out.println("Auftrag " + auftrag.getAuftragsName() + " in der Datenbank gespeichert");
    }
}
