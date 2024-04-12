package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EEnseignant extends AbstractEntity{

    private String matricule;
    private String specialite;
    private Double salaireBase;
    private boolean selected;
    private String validite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departement")
    private EDepartement departement;

}
