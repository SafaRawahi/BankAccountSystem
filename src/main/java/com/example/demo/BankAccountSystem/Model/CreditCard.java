package com.example.demo.BankAccountSystem.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
public class CreditCard extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer CreditCardId;
    String Name;
    Integer CreditCardNumber;
    Integer ExpireDate;
    @ManyToOne
    @JoinColumn(name="Customer_Id", referencedColumnName = "CustomerId")
    Customer customer;
}
