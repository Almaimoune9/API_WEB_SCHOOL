package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class FHonoraire extends AbstractEntity {


    private Integer annee;
    private Double montant;
    private Double total;
    private Double tva;
    private Double retenue;
    private Double net;
    private Date date;
    private Double autreRetenue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enseignant")
    private EEnseignant enseignant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
    private CUser user;
}
