package com.aa.microservice2transaction.service;

import com.aa.microservice2transaction.model.Transaction;

public interface ITransactionService {

    Object saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    Object findAllTransactionOfUser(Long userId);
    
}
