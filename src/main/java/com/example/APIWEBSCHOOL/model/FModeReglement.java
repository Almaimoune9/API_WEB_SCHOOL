package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Entity
@Data
public class FModeReglement extends AbstractEntity {

    private String libelle;
    private boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;
}
