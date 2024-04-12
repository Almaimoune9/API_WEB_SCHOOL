package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class FCategoriesDepenses extends AbstractEntity{


    private String code;
    private String libelle;
    private Boolean estHonoraire;
    private String compte;
    private Boolean etat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;
}
