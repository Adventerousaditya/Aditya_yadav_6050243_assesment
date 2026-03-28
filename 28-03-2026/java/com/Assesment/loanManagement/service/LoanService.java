package com.Assesment.loanManagement.service;

import com.Assesment.loanManagement.entity.Loan;

import java.util.List;

public interface LoanService {

    Loan createLoan(Loan loan);

    List<Loan> getAllLoans();

    Loan getLoanById(Long id);

    Loan updateLoanStatus(Long id, String status);
}