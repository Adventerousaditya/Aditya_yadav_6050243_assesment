package com.Assesment.loanManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double loanAmount;
    
    
    @Column(nullable = false)
    private String applicantName;
    
    
    @Column(nullable = false)
    private String status;
    public Loan() {
    }

    public Loan(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Long getId() {
        return id;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
    public String getApplicantName() {
        return applicantName;
    }
    public void setLoanAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Loan amount cannot be negative");
        }
        this.loanAmount = amount;
    }
    public void setStatus(String status) {
    	this .status = status;
    }
}
