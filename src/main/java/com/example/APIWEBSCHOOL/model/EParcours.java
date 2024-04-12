package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EParcours extends AbstractEntity{



    private String code;
    private String libelle;
    private Double credit;
    private Double tauxProgression;
    private boolean semestreObligatoire;
    private Boolean etat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vocation")
    private EVocation vocation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "formations")
    private EFormations formations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "formationsSpecialisation")
    private EFormationsSpecialisation formationsSpecialisation;

}
