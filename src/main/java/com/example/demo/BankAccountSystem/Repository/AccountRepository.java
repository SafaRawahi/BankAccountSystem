package com.example.demo.BankAccountSystem.Repository;

import com.example.demo.BankAccountSystem.Model.Account;
import com.example.demo.BankAccountSystem.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query(value = "SELECT customer_Id FROM customer WHERE phone_number = :phone_number", nativeQuery = true)
    Integer findIdByPhoneNumber(@Param("phone_number") String phone_number);


    @Query(value = "Select a.balance From Account a WHERE a.id = :id")  ////    Retrieve the account balance for a specific account by id
    Double getBalanceForAccount(@Param("id") Integer id);
}
