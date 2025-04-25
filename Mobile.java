package com.Jsp.Has_a_Relationship;

public class Mobile {
String Mobilename;
String colour;
int ram;
int rom;
SimCard s;//Has_A
public Mobile(String Mobilename,String colour, int ram,int rom,SimCard s)
{
	this.Mobilename=Mobilename;
	this.colour=colour;
	this.ram=ram;
	this.rom=rom;
	this.s=s;
}
public void insertSim(SimCard s)
{
	this.s=s;
}
public void display()
{
	System.out.println(Mobilename);
	System.out.println(colour);
	System.out.println(ram);
	System.out.println(rom);
	
	if(s!=null)
	
		s.display();
		else
			System.out.println("SimCard is no added");
    }
public void display(SimCard simCard) {
	// TODO Auto-generated method stub
	
}

}