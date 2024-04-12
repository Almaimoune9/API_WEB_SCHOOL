package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class FCategoriesRecettes extends AbstractEntity{


    private String code;
    private String libelle;
    private Boolean estInscription;
    private Boolean estFrais;
    private String compte;
    private Boolean etat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;

}
