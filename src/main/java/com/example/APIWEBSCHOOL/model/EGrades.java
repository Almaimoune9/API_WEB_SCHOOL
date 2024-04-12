package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EGrades extends AbstractEntity{


    @Column(name = "code", length = 10,nullable = false)
    private  String code;

    @Column(name = "libelle", length = 30,nullable = false)
    private String libelle;

    @Column( name = "type", length = 30,nullable = false)
    private  String type;

    @Column( name = "nbreAnnee", length = 10,nullable = false)
    private String nbreAnnee;

    private Boolean etat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;
}
