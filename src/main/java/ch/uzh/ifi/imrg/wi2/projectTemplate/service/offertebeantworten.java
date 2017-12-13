package ch.uzh.ifi.imrg.wi2.projectTemplate.service;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;

import java.util.Random;

public class offertebeantworten implements JavaDelegate{

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Starting Task offertebeantworten");
        int[] myArray = new int[]{0, 1};
        Random generator = new Random();
        int randomIndex = generator.nextInt(myArray.length);
        int randomAnswer = myArray[randomIndex];
        delegateExecution.setVariable("offerteangenommen", randomAnswer);

        System.out.println("offerteangenommen ist: " + (Integer) delegateExecution.getVariable("offertebeantworten"));

    }
}
