package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EFormationsSpecialisation extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;
    private String abreviation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "formations")
    private EFormations formations;
}
