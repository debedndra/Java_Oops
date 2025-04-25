package com.Jsp.Abstraction;
abstract class Bank
{
	Bank()
	{
		System.out.println("Bank() Cons");
    }
	abstract int getRateOfInt();
}
class SBI extends Bank
{
	SBI()
	{
		System.out.println("SBI() Cons");
	}
	@Override
	int getRateOfInt()
	{
		return 10;
	}
}
class ICICI extends Bank
{
	ICICI()
	{
		System.out.println("ICICI() Cons");
	}
	@Override
	int getRateOfInt()
	{
		return 11;
	}
}

public class BankDriver 
{
public static void main(String[] args)
  {
	Bank b;
	b=new SBI();
	System.out.println(b.getRateOfInt()+" SBI INT ");
	System.out.println("--------------------------");
	b = new ICICI();
	System.out.println(b.getRateOfInt()+" ICICI INT ");
  }
}



