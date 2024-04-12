package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CEtablissement extends AbstractEntity{



    private String code;
    private String nom;
    private String abreviation;
    private String identifiantEtab;
    private String groupe;
    private String pays;
    private String ville;
    private String adresse;
    private String type;
    private String tel;
}
