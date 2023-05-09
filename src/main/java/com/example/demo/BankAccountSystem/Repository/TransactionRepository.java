package com.example.demo.BankAccountSystem.Repository;

import com.example.demo.BankAccountSystem.Model.Account;
import com.example.demo.BankAccountSystem.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
