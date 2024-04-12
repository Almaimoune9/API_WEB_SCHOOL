package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CAnneeAcademique extends AbstractEntity{


    private String anneeAcademique;
    private Long anneeDeb;
    private Long anneeFin;
    private Date dateDeb;
    private Date dateFin;
    private String objectif;
    private Boolean isActif;
    private Date dateCloture;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private  CEtablissement etablissement;
}
