package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EDepartement  extends AbstractEntity{


    private String code;
    private String nom;
    private String description;
    private String tel;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private  CEtablissement etablissement;
}
