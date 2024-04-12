package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CBatiment extends AbstractEntity{


    private String code;
    private String nom;
    private String description;
    private Date createDate;
    private Date updateDate;
    private Integer type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;
}
