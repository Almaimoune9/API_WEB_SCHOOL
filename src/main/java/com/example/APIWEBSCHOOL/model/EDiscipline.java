package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EDiscipline extends AbstractEntity {




    @Column(name = "code", length = 10, nullable = false)
    private String code;

    @Column(name = "nom_discipline",length = 30,nullable = false)
    private String nom;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private  CEtablissement etablissement;

}
