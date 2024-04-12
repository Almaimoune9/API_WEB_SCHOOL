package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class FCategoriesRecettesAnnee extends AbstractEntity{

    private Double montant;
    private Integer nbecheance;
    private Integer periodicite;
    private String remise;
    private boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "")
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

