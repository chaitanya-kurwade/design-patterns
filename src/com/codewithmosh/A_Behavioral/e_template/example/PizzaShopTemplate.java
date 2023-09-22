package com.codewithmosh.A_Behavioral.e_template.example;

public abstract class PizzaShopTemplate {

	private OrderPlaced orderPlaced;
	
	public PizzaShopTemplate() {
		orderPlaced = new OrderPlaced();
	}
	
	public PizzaShopTemplate(OrderPlaced orderPlaced) {
		this.orderPlaced=orderPlaced;
	}
	
	protected final void preparePizza() {
		selectBread();
		ingredients();
		cooking();
		cheese();
		toppings();
	}
	
	
	////////////////////
	public void takingOrder() {
		orderPlaced.orderPlaced();
		preparePizza();
	}
	
	
	
	protected abstract void selectBread();
	protected abstract void ingredients();
	protected final void cooking() {
		System.out.println("Cooking pizza for 15 mins.");
	}
	protected final void cheese() {
		System.out.println("Adding cheese.");
	}
	protected final void toppings() {
		System.out.println("Adding toppings.");
	}
	protected void extraCheese() {
		System.out.println("adding extra cheeses");
	}
}
