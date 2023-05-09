package com.example.demo.BankAccountSystem.Service;


import com.example.demo.BankAccountSystem.Model.Account;
import com.example.demo.BankAccountSystem.Model.Transaction;
import com.example.demo.BankAccountSystem.Repository.AccountRepository;
import com.example.demo.BankAccountSystem.Repository.TransactionRepository;
import com.example.demo.BankAccountSystem.RequestObject.TransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    AccountRepository accountRepository;
    public String createTransaction(TransactionRequest transactionRequest) {
        Transaction transaction = new Transaction();
        transaction.setAmount(transactionRequest.getAmount());
        Integer id = accountRepository.getAccountByAccountName(transactionRequest.getAccountName());
        Account account = accountRepository.findById(id).get();
        transaction.setIsActive(account.getIsActive()); // if account is active then transaction is active
        transaction.setAccount(account);
        Double transactionAmount = transactionRequest.getAmount();
        Double accountBalance = account.getBalance();
        Double newBalance = accountBalance - transactionAmount;
        account.setBalance(newBalance);
        accountRepository.save(account);
        transactionRepository.save(transaction);
        return "Transaction done successfully";
    }

    }
