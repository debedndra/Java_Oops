package com.Jsp.Java8;

public class Emp {
   String Name;
   int Age;
   int eId;
   int Sal;
   public Emp(String Name, int Age, int eId, int Sal)
   {
	   this.Name=Name;
	   this.Age=Age;
	   this.eId=eId;
	   this.Sal=Sal;
   }
@Override
   public String toString() {
	   return "Emp [Name=" + Name +", Age=" + Age+", eId=" + eId +", Sal=" + Sal +"]";
	   }
}
