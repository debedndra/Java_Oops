package com.Jsp.Has_a_Relationship;

public class MobileDriver {
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile("OPPO","BLUE",4,128, null);
	    m1.display();
		m1.display(new SimCard("Airtel",773521012));//Has_A
		System.out.println("-----------------------");
		m1.display();
		
		
	}

}
