package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CTypeSalle extends AbstractEntity {



    private String code;
    private String lib;
    private String description;
    private Date createDate;
    private Date updateDate;
    private Boolean selected;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement")
    private CEtablissement etablissement;
}
