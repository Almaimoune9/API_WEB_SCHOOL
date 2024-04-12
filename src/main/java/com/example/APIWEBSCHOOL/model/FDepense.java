package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class FDepense extends AbstractEntity{


    private Integer annee;
    private String periode;
    private String mandat;
    private Date date;
    private String numeroTransaction;
    private String libelle;
    private String remarques;
    private Double montant;
    private Double total;
    private Double totalTva;
    private Double retenue;
    private Double net;
    private String compte;
    private String cheque;
    private String creancier;
    private Integer etat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enseignant")
    private EEnseignant enseignant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "honoraire")
    private FHonoraire honoraire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modeReglement")
    private FModeReglement modeReglement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
    private CUser user;
}
