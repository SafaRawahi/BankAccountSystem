package com.example.demo.BankAccountSystem.Controller;


import com.example.demo.BankAccountSystem.Model.Account;
import com.example.demo.BankAccountSystem.Model.Customer;
import com.example.demo.BankAccountSystem.RequestObject.AccountRequest;
import com.example.demo.BankAccountSystem.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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


    //    Retrieve the account balance for a specific account by id
    @RequestMapping(value = "getBalanceForAccount", method = RequestMethod.GET)
    public double getBalanceForAccount(@RequestParam Integer id) {

        return accountService.getBalanceForAccount(id);
    }

    // Calculate the interest on the account balance.
    @PostMapping("/calculate-interest")
    public ResponseEntity<String> calculateInterest() {
        accountService.calculateInterest();
        return ResponseEntity.ok("Interest calculated successfully");
    }
    @RequestMapping(value = "getAll", method = RequestMethod.GET)       //getAll
    public List<Account> gerAllAccounts(){

        List<Account> accountList=new ArrayList<>();
        accountList= accountService.getAllAccount();
        return accountList;
    }



}
