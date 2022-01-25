package com.visitor.java;

public class Demo {

	public static void main(String[] args) {
		NormalProduct normal = new NormalProduct(30);
		DiscountProduct discount = new DiscountProduct(30);
		
		Tax tax = new Tax();
		
		System.out.println("Tax of a normal product: " + normal.accept(tax));
		System.out.println("Tax of a product with discount: " + discount.accept(tax));
	}

}
