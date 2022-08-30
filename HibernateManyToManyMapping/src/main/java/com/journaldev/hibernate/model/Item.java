package com.journaldev.hibernate.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class Item {
    private long id;
    private double price;
    private String description;
    
    private Set<Cart> carts;
    
}
