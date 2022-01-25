package com.visitor.java;

public class NormalProduct {
	private double price;

	
	public NormalProduct(double price) {
		this.price = price;
	}

	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}
}
