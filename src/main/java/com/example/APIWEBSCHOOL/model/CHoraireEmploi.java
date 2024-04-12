package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class CHoraireEmploi extends AbstractEntity{

    private boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "annee")
    private CAnneeAcademique anneeAcademique;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trancheHoraire")
    private CTrancheHoraire trancheHoraire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jour")
    private CJour jour;
}
