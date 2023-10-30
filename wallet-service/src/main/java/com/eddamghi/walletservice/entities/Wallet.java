package com.eddamghi.walletservice.entities;

import com.eddamghi.walletservice.enums.Devise;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Wallet {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private double solde;
    private String dateCreation;
    private Devise devise;
    @ManyToOne
    private Client client;

}

