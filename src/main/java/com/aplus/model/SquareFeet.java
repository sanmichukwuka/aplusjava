package com.aplus.model;

public enum SquareFeet {
	// Constants with values
	UP_TO_1000(86), UP_TO_1500(100), UP_TO_2000(150), UP_TO_3000(200), UP_TO_4000(250), UP_TO_5000(300),
	UP_TO_6000(400), OTHER(500);

	// Instance variable
	private int price;

	// Constructor to initialize the instance variable
	SquareFeet(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
