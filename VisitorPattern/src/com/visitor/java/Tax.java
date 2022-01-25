package com.visitor.java;

public class Tax implements Visitor{
	private final double normalTax = 0.16;
	private final double discountTax = 0.10;
	
	public double visit(NormalProduct normal) {
		return (normal.getPrice() * normalTax) + normal.getPrice();
	}
	
	@Override
	public double visit(DiscountProduct discount) {
		return (discount.getPrice() * discountTax) + discount.getPrice();
	}
}
