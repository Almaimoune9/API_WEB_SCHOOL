package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class EModesAtomes extends AbstractEntity{

    private String code;
    private String libelle;
    private Integer priorite;
    private Boolean payable;
    private Boolean etat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;
}
