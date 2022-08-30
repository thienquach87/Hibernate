package com.journaldev.hibernate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="ITEM1")
public class Item1 {
    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="item_price")
    private double price;
    @Column(name="item_description")
    private String description;
}
