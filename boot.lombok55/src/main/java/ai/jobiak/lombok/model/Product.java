package ai.jobiak.lombok.model;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString
@NonNull
public class Product {
	
	
	private int productId;
	private String description;
	private double price;
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}

}
