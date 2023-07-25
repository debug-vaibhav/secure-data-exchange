package com.workshop.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String code;

    private Integer capacity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Hotel_Id")
    private Hotel hotel;
}
