package com.model;

public class Gift 
{
	private int giftId;
	private String giftName;
	private String category;
	private float price;
	
	
	public Gift() {
		super();
		
	}
	
	
	public Gift(String giftName, String category, float price) {
		super();
		//this.giftId = giftId;
		this.giftName = giftName;
		this.category = category;
		this.price = price;
	}


	public int getGiftId() {
		return giftId;
	}


	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}


	public String getGiftName() {
		return giftName;
	}


	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Gift [giftId=" + giftId + ", giftName=" + giftName + ", category=" + category + ", price=" + price
				+ "]";
	}

	public void display()
	{
		System.out.println("*************** || ****************");
		System.out.println("\n Gift "+getGiftId());
		
		System.out.println(" Gift Name : "+getGiftName());
		System.out.println(" Gift Category : "+getCategory());
		System.out.println(" Gift Price : "+getPrice());
		System.out.println();
	}
	
	
}
