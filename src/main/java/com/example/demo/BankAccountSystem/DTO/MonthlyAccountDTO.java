package com.example.demo.BankAccountSystem.DTO;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class MonthlyAccountDTO {
   Integer CustomerId;
    String phoneNumber;
    Double intrest;
    Double balance;

    public MonthlyAccountDTO(Integer customerId, String phoneNumber, Double intrest, Double balance) {
        CustomerId = customerId;
        this.phoneNumber = phoneNumber;
        this.intrest = intrest;
        this.balance = balance;
    }
}
