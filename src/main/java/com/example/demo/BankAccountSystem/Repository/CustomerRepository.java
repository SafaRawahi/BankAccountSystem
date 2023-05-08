package com.example.demo.BankAccountSystem.Repository;

import com.example.demo.BankAccountSystem.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
