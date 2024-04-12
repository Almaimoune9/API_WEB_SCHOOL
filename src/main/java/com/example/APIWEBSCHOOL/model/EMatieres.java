package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EMatieres extends AbstractEntity{


    private String code;
    private String libelle;
    private Boolean etat;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discipline")
    private EDiscipline discipline;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "anneeAcademique")
    private CAnneeAcademique anneeAcademique;
}
