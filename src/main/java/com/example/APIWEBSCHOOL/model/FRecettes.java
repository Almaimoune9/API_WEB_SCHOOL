package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class FRecettes extends AbstractEntity{

    private Integer annee;
    private Date date;
    private String numeroTransaction;
    private String libelle;
    private String remarques;
    private String recu;
    private Double montant;
    private Double total;
    private Double totalTva;
    private Double remise;
    private Double net;
    private String compte;
    private String cheque;
    private String tiers;
    private Integer etat;
    private Date datedelai;

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
