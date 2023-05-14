package com.example.demo.BankAccountSystem.DTO;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class MonthlyAccountDTO {
   Integer customer_Id;
    String phoneNumber;
    Double intrest;
    Double balance;

    public MonthlyAccountDTO(Integer customer_Id, String phoneNumber, Double intrest, Double balance) {
        this.customer_Id = customer_Id;
        this.phoneNumber = phoneNumber;
        this.intrest = intrest;
        this.balance = balance;
    }
}
