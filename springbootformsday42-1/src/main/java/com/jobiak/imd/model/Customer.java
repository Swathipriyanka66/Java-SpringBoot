package com.jobiak.imd.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {
	
	@Id
	private Long acctno;
	private String name;
	private double balance;
	
	public Long getAcctno() {
		return acctno;
	}
	public void setAcctno(long i) {
		this.acctno = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [acctno=" + acctno + ", name=" + name + ", balance=" + balance + "]";
	}
	public Customer(Long acctno, String name, double balance) {
		
		this.acctno = acctno;
		this.name = name;
		this.balance = balance;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
}

