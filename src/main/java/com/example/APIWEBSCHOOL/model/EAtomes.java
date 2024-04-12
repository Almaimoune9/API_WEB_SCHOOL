package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class EAtomes extends AbstractEntity{

    private Integer seuil;
    private Integer goupePrevu;
    private Integer groupeReel;
    private Integer valeur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matieres")
    private EMatieres matieres;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "anneeAcademique")
    private CAnneeAcademique anneeAcademique;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typesAtomes")
    private ETypesAtomes typesAtomes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modesAtomes")
    private EModesAtomes modesAtomes;
}
