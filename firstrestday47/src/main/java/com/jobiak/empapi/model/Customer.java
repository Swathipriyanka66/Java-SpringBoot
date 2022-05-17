package com.jobiak.empapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer 
{

    @Id
    @GeneratedValue
	private Long Id;
	private String name;
	private double balance;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public Customer(Long id, String name, double balance) {
		super();
		Id = id;
		this.name = name;
		this.balance = balance;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public void setId(long l) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setBalance(int i) {
		// TODO Auto-generated method stub
		
	}
}
	