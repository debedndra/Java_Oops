package com.Jsp.Abstraction_1;

import java.util.Scanner;

interface Payble
{
	void Pay();
}
class UPI implements Payble
{
	@Override
	public void Pay()
	{
		System.out.println("Paid by using UPI");
	}
}
class CreditCard implements Payble
{
	@Override
	public void Pay()
	{
		System.out.println("Paid by using CreditCard");
	}
}
class NetBank implements Payble
{
	@Override
	public void Pay()
	{
		System.out.println("Paid by using NetBank");
	}
}
class Payment
{
	public static Payble getIns()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("1.UPI\n2.CreditCard\n3.NetBank");
		int n = s.nextInt();
		
		if(n == 1)
			return new UPI();
			else if(n == 2)
				return new CreditCard();
			else if(n == 3)
				return new NetBank();
			else
				return null;
		}
	}

public class Driver {
	public static void main(String[] args)
	{
		Payble p = Payment.getIns();
		p.Pay();
	}

}
