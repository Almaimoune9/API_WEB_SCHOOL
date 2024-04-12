package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class CCivilite extends AbstractEntity{

    private Long id;
    private CEtablissement CEtablissement;
    private String code;
    private String libelle;
}
