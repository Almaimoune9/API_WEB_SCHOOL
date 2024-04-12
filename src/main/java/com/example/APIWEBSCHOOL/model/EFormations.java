package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EFormations extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String libelle;
    private String specialite;
    private String specialisation;
    private String type;
    private Boolean etat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grades")
    private EGrades grades;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private  CEtablissement etablissement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "domaine")
    private EDomaine domaine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departement")
    private EDepartement departement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vocation")
    private EVocation vocation;
}
