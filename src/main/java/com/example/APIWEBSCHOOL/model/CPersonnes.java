package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CPersonnes extends AbstractEntity{


    private String code;
    private String nom;
    private String prenom;
    private String sexe;
    private String pere;
    private String mere;
    private Date dateNaissance;
    private String villeNaissance;
    private String nationnalite;
    private String photo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "situationFamiliale")
    private CSituationFamiliale situationFamiliale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;
}
