package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CSalles extends AbstractEntity{


    private String code;
    private String nom;
    private String numero;
    private Date createDate;
    private Date updateDate;
    private Boolean selected;
    private Integer capacite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batiment")
    private  CBatiment batiment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeSalle")
    private CTypeSalle typeSalle;
}
