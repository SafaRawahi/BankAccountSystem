package com.example.demo.BankAccountSystem.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
public class Transaction extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer TransactionId;
    Double Amount;
    @ManyToOne
    @JoinColumn(name = "Account_Id", referencedColumnName = "id")
    Account account;
}
