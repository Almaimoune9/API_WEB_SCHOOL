package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CTrancheHoraire extends AbstractEntity{

    private Date heureDeb;
    private Date heureFin;
    private Integer numero;
    private Boolean manuel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "anneeAcademique")
    private CAnneeAcademique anneeAcademique;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;

}
