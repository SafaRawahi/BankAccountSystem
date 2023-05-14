package com.example.demo.BankAccountSystem.Repository;

import com.example.demo.BankAccountSystem.Model.Customer;
import com.example.demo.BankAccountSystem.Model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
}
