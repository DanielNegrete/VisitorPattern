package com.visitor.java;

interface Visitor {
	public double visit(NormalProduct normal);
	public double visit(DiscountProduct discount);
}
