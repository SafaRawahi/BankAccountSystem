package com.example.demo.BankAccountSystem.Controller;

import com.example.demo.BankAccountSystem.RequestObject.TransactionRequest;
import com.example.demo.BankAccountSystem.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class TransactionController {

@Autowired
    TransactionService transactionService;

    @RequestMapping(value = "makeTransaction", method = RequestMethod.POST)
    public String makeTransaction(@RequestBody TransactionRequest transactionRequest) {
        try {
            transactionService.createTransaction(transactionRequest);
            return "Transaction made Successfully";
        } catch (Exception e) {
            return "Transaction made Failed";
        }
    }
}
