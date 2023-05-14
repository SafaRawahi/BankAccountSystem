package com.example.demo.BankAccountSystem.Service;


import com.example.demo.BankAccountSystem.Model.Account;
import com.example.demo.BankAccountSystem.Model.Customer;
import com.example.demo.BankAccountSystem.Repository.AccountRepository;
import com.example.demo.BankAccountSystem.Repository.CustomerRepository;
import com.example.demo.BankAccountSystem.RequestObject.AccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    CustomerRepository customerRepository;

//         Create a new account for a customer
    public void addAccount(AccountRequest account) {
        Double interestVariable = 2.5; // variable for interest
        Account accountInfo = new Account();
        accountInfo.setAccountName(account.getAccountName());
        accountInfo.setBalance(account.getBalance());
        accountInfo.setCreatedDate(new Date());
        accountInfo.setIntrest(account.getBalance()* interestVariable);// balance * interest Variable to get the profit
        Integer id = accountRepository.findIdByPhoneNumber(account.getPhoneNumber()); // find ID by unique variable (Phone)
        Customer customerId = customerRepository.findById(id).get() ;
        accountInfo.setCustomer(customerId);
        accountInfo.setIsActive(account.isActive());
        accountRepository.save(accountInfo);

    }
    //    Retrieve the account balance for a specific account by id
    public double getBalanceForAccount(Integer id) {

        return accountRepository.getBalanceForAccount(id);
    }

    //Calculate the interest on the account balance.
    public void calculateInterest() {
        List<Account> accounts = accountRepository.findAll();
        for (Account account : accounts) {
            double balance = account.getBalance();
            double interestRate = account.getIntrest();
            double intrests = balance * interestRate;

            account.setIntrest(intrests);
        }

        accountRepository.saveAll(accounts);
    }



    public List<Account> getAllAccount() {      //getAllAccount
        return accountRepository.getAllAccount();
    }
}
