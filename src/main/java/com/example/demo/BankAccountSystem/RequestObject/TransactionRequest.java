package com.example.demo.BankAccountSystem.RequestObject;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class TransactionRequest  {
    private Double amount;
    private String accountName;
    private boolean isActive;
}
