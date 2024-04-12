package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class ETypesAtomes extends AbstractEntity{

    private String code;
    private String libelle;
    private Integer priorite;
    private Integer numerateur;
    private Integer denominateur;
    private Integer seuil;
    private Boolean etat;
    private boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;
}