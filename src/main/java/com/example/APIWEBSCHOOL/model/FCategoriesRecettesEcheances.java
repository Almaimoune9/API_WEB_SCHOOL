package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class FCategoriesRecettesEcheances extends AbstractEntity{

    private Integer ordre;
    private Date date;
    private Double montant;

    @ManyToOne(fetch = FetchType.LAZY)
    private FCategoriesRecettesAnnee categoriesRecettesAnnee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "formations")
    private EFormations formations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoriesRecettes")
    private FCategoriesRecettes categoriesRecettes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "anneeAcademique")
    private CAnneeAcademique anneeAcademique;
}
