package com.example.demo.BankAccountSystem.Controller;


import com.example.demo.BankAccountSystem.Model.Account;
import com.example.demo.BankAccountSystem.Model.Customer;
import com.example.demo.BankAccountSystem.RequestObject.AccountRequest;
import com.example.demo.BankAccountSystem.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;


//     Create a new account for a customer
    @RequestMapping(value = "AddAccount",method = RequestMethod.POST)
    public String AddAccount (@RequestBody AccountRequest account){
        try {
            accountService.addAccount(account);
            return "Account added Successfully";
        }catch (Exception e){
            return "Account added Failed";
        }
    }



}
