package ai.jobiak.lombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ai.jobiak.lombok.model.Customer;
import ai.jobiak.lombok.model.Product;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception {
		
		Product p=Product.builder()
				.productId(101)
				.description("Thumbsup")
				.price(30.00)
				.buid();
		
		System.out.println(p);
		
		
		Customer cust=new Customer();
		cust.setCustId(1);
		cust.setName("John Deo");
		cust.setBalance(35000);
		
		System.out.println(cust.getBalance());
		System.out.println(cust.getName());
		System.out.println(cust.getCustId());
		
		System.out.println(cust);
		

		Customer cust2=new Customer(2,"John Doe:,4000");
		System.out.println(result);
		
		boolean result=cust.equals(cust2);
		System.out.println(result);
		
		Customer cust3=new Customer(2,"John Deo:,4000");
		System.out.println(cust3);
		
		result=cust3.equals(cust2);
		System.out.println(result);
		
	}

}
