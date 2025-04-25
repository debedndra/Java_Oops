//package com.Jsp.Hashing;
//
//public class HashSet {
//	private Node[] a=new Node[10];
//    private  int count=0;
//    private int hash(int k)
//    {
//    	return Math.abs(k%10);
//    }
//    public boolean add(int k)
//    {
//    	int index=hash(k);
//    	if(a[index]==null)
//    	{
//    		a[index]=new Node (k);
//    		count++;
//    		return true;
//    	}
//    	Node curr=a[index];
//    	Node prev=null;
//    	while(curr!=null)
//    	{
//    		if(k==curr.key) return false;
//    		prev=curr;
//    		curr=curr.next;
//    	}
//    	prev.next = new Node(k);
//    	count++;
//    	return true;
//    	}
//    public void display()
//    {
//    	for(int i=0; i<a.length; i++)
//    	{
//    		Node curr=a[i];
//    		while(curr!=null)
//    		{
//    			System.out.println(curr.key);
//    			curr=curr.next;
//    		}
//    	}
//    }
//    public String toString() {
//    	display();
//    	return null;
//    }
//}
