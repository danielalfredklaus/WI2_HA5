package ch.uzh.ifi.imrg.wi2.projectTemplate.service;

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

    }
}
