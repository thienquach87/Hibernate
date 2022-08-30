package com.journaldev.hibernate.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class Cart {
    private long id;
    private double total;
    private Set<Item> items;
}
