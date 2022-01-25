package com.visitor.java;

public class DiscountProduct {
	private double price;
	
	public DiscountProduct(double price) {
		this.price = price;
	}
	
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}
}
