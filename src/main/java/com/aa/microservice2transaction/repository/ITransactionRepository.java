package com.aa.microservice2transaction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aa.microservice2transaction.model.Transaction;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {   // model ve id 
    // otomatik crud işlemleri, direkt findByName mesela
    List<Transaction> findAllByUserId(Long userId);

    void deleteAllById(Long transactionId);

    List<Transaction> findAllById(Long userId);
}
