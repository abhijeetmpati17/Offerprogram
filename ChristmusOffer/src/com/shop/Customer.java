package com.shop;

public class Customer
{
	private String customerType;
	private float billAmt;
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public float getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "Customer [customerType=" + customerType + ", billAmt=" + billAmt + "]";
	}
	public Customer(String customerType, float billAmt) {
		super();
		this.customerType = customerType;
		this.billAmt = billAmt;
	}
	public Customer() {
		super();
		
	}
	
	public void bill()
	{
		if(customerType.equals("Regular"))
		{
			if(billAmt>0 && billAmt<5000)
			{
				System.out.println("Customer Type :"+customerType);
				System.out.println("Billing Amt :"+billAmt);
				System.out.println("Discounted Amt :"+"0/-");
				System.out.println("Total Bill to pay :"+billAmt);
				
			}
			else if(billAmt>=5000 && billAmt<10000)
			{
				System.out.println("Customer Type :"+customerType);
				System.out.println("Billing Amt :"+billAmt);
				System.out.println("Discounted Amt :"+billAmt*0.1+"/-");
				System.out.println("Total Bill to pay :"+billAmt*0.9+"/-");
			}
			else if(billAmt>=10000 )
			{
				System.out.println("Customer Type :"+customerType);
				System.out.println("Billing Amt :"+billAmt);
				System.out.println("Discounted Amt :"+billAmt*0.2+"/-");
				System.out.println("Total Bill to pay :"+billAmt*0.8+"/-");
			}
			else
			{
				System.out.println("invalid input :");
			}
		}
		else
		{
			if(customerType.equals("Premium"))
			{
				if(billAmt>0 && billAmt<4000)
				{
					System.out.println("Customer Type :"+customerType);
					System.out.println("Billing Amt :"+billAmt);
					System.out.println("Discounted Amt :"+billAmt*0.1+"/-");
					System.out.println("Total Bill to pay :"+billAmt*0.9+"/-");
				}
				else if(billAmt>=4000 && billAmt<8000)
				{
					System.out.println("Customer Type :"+customerType);
					System.out.println("Billing Amt :"+billAmt);
					System.out.println("Discounted Amt :"+billAmt*0.15+"/-");
					System.out.println("Total Bill to pay :"+billAmt*0.85+"/-");
				}
				else if(billAmt>=8000 && billAmt<12000 )
				{
					System.out.println("Customer Type :"+customerType);
					System.out.println("Billing Amt :"+billAmt);
					System.out.println("Discounted Amt :"+billAmt*0.2+"/-");
					System.out.println("Total Bill to pay :"+billAmt*0.8+"/-");
				}
				else if(billAmt>=12000)
				{
					System.out.println("Customer Type :"+customerType);
					System.out.println("Billing Amt :"+billAmt);
					System.out.println("Discounted Amt :"+billAmt*0.3+"/-");
					System.out.println("Total Bill to pay :"+billAmt*0.7+"/-");
				}
				else
				{
					System.out.println("Wrong imput :");
				}
			}
		}
		
	}
	
	
}
