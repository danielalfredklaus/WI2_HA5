package ch.uzh.ifi.imrg.wi2.projectTemplate.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auftrag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String auftragsName;
    private boolean selbstverschuldet;
    private int kaputtesTeil;
    private String adresse;


}
