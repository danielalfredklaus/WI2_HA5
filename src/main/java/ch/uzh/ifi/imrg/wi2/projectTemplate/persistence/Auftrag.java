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
    private int selbstverschuldet;
    private int kaputtesTeil;
    private String adresse;
    private int offerteangenommen;
    private int kosten;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuftragsName() {
        return auftragsName;
    }

    public void setAuftragsName(String auftragsName) {
        this.auftragsName = auftragsName;
    }

    public int getSelbstverschuldet() {
        return selbstverschuldet;
    }

    public void setSelbstverschuldet(int selbstverschuldet) {
        this.selbstverschuldet = selbstverschuldet;
    }

    public int getKaputtesTeil() {
        return kaputtesTeil;
    }

    public void setKaputtesTeil(int kaputtesTeil) {
        this.kaputtesTeil = kaputtesTeil;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getOfferteangenommen() {
        return offerteangenommen;
    }

    public void setOfferteangenommen(int offerteangenommen) {
        this.offerteangenommen = offerteangenommen;
    }

    public int getKosten() {
        return kosten;
    }

    public void setKosten(int kosten) {
        this.kosten = kosten;
    }
}
