package com.Jsp.ListImplemnts;

public class ArrayList {
	private Object[] a=new Object[5];
	private int p=0;
	private int index;
	public void add(Object e)
	{
		if(p>=a.length) increase();
		a[p++]=e;
	}
	private void increase() {
		Object[] temp=new Object[a.length+1];
		for(int i=0; i<a.length; i++)
		{
			temp[i]=a[i];
		}
		a=temp;
	}
	public void add(int index, Object e)
	{
		if(index<=-1 || index>=size()) throw new  IndexOutOfBoundsException();
		if(p>=a.length) increase();
		for(int i=size()-1; i>=index; i--)
		{
			a[i+1]=a[i];
		}
		a[index]=0;
		p++;
	}
	public int size() {
		return p;
	}
    public Object get(int index)
    {
    	if(index<=-1 || index>=size())
    	{
    		throw new IndexOutOfBoundsException();
    	}
    	return a[index];
    }
    public void rename(int index)
    {
    	if(index<=-1 || index>=size())
    	{
    	throw new IndexOutOfBoundsException(); 
    }
    for(int i=index+1; i<size(); i++)
    {
    	a[i-1]=a[i];
    }
    p--;
    a[p]=null;
  }
}
