package com.example.demo.BankAccountSystem.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
public class Loan extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer LoanId;
    Double TotalAmount;
     Double MonthlyAmount;


    @ManyToOne
    @JoinColumn(name="Customer_Id", referencedColumnName = "CustomerId")
    Customer customer;
}
