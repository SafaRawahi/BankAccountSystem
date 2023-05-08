package com.example.demo.BankAccountSystem.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
public class Account extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String AccountName;
    Double balance;
    Double intrest;

    @ManyToOne
    @JoinColumn(name = "Customer_Id", referencedColumnName = "CustomerId")
    Customer customer;



}
