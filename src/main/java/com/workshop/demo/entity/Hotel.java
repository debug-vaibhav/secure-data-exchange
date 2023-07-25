package com.workshop.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Hotel {

    @Id
    @GeneratedValue
    @Column(name = "Hotel_Id")
    private Long id;

    private String name;

    private String code;
}
