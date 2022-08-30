package com.journaldev.hibernate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Entity
@Getter
@Setter
@Table(name = "CART1")
public class Cart1 {
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "cart_total")
    private double total;
    @ManyToMany(targetEntity = Item1.class, cascade = {CascadeType.ALL})
    @JoinTable(name = "CART_ITEMS1",
                            joinColumns = {@JoinColumn(name = "cart_id")},
                            inverseJoinColumns = {@JoinColumn(name = "item_id")}
            )
    private Set<Item1> items;
}
