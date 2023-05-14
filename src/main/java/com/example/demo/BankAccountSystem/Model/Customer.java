package com.example.demo.BankAccountSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer customerId;
    @Column(name="Customer_Name")
    String name;

    String phoneNumber;
    Integer age;
    String email;
}
