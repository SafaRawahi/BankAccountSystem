package com.example.demo.BankAccountSystem.RequestObject;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Setter
@Getter
public class UpdateCustomerInfo {
    Integer id;
    String name;
    String email;
    String phoneNumber;
    Integer age;
    Date createdDate;
    Date updatedDate;
    Boolean isActive;
}
