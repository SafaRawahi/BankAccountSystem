package com.example.demo.BankAccountSystem.RequestObject;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


@Getter
@Setter
@Data
public class AccountRequest {
    String AccountName;
    Double balance;
    boolean isActive;
    String phoneNumber;
}


