package com.example.APIWEBSCHOOL.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.io.Serializable;

@Data
@MappedSuperclass
public class AbstractEntity implements Serializable, Comparable <AbstractEntity> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Override
    public int compareTo(AbstractEntity o) {
        return 0;
    }
}
