package com.jobiak.imd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repository.CustomerRepo;

@Component
public class MyCommandLineClass implements CommandLineRunner {
	@Autowired
	CustomerRepo repo;
	private Customer cust;
	
	@Override
	public void run(String... args) throws Exception {
		
		cust.setAcctno(1);
		cust.setName("abc");
		cust.setBalance(4000);
		repo.save(cust);
		
		
		
		/*
		 * Customer c1=new Customer();c1.setAcctno(101L);c1.setName("Yaan");
		 * c1.setBalance(3000);
		 * 
		 * repo.save(c1); Customer c2=new Customer();c2.setAcctno(102L);
		 * c2.setName("Mefil");c2.setBalance(4000);
		 * 
		 * repo.save(c2); Customer c3=new Customer();
		 * c3.setAcctno(103L);c3.setName("Jhon"); c3.setBalance(5000);
		 * 
		 * repo.save(c3); Customer c4=new Customer();c4.setAcctno(104L);
		 * c4.setName("Sinchan");c4.setBalance(5000); repo.save(c4);
		 * 
		 * 
		 * 
		 * Optional<Customer>cust=repo.findById(101L); if(cust.isPresent()) {
		 * System.out.println(cust.get());
		 * 
		 * } List<Customer>list=repo.findAll(); for(Customer c:list) {
		 * System.out.println(c); }
		 */
	}

}
@Configuration
class CustmerConfiguration{
	@Bean
	public Customer createCusomer() {
		return new Customer();
		
		
		
	}
}
