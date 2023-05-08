package com.example.demo.BankAccountSystem.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

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
    @UpdateTimestamp
    Date ExpireDate;
    Double payment;
    @ManyToOne
    @JoinColumn(name="Customer_Id", referencedColumnName = "CustomerId")
    Customer customer;
}
