package com.Jsp.ListImplemnts;

public class Node {
	
	public Object ele;
	public Node next;
	public Node left;
	public Node right;
	public char[] key;
	public Node(Object e, Node n)
	{
		ele=e;
		next=n;
	}
}
