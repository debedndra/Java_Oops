package com.Jsp.BinaryTree;
import java.util.Scanner;
public class BinaryTree {
   Node root;
   
public void add(int key) {
	   root=new Node(key);
	   Populate(root);
   }
private void Populate(Node n) {
	System.out.println("Do you want to Insert Element left side of :"+n.key);
	boolean left=new Scanner(System.in).nextBoolean();
	if(left) {
		n.left=new Node(new Scanner(System.in).nextInt());
		Populate(n.left);
	}
	System.out.println("Do you want to Insert Element right side of :"+n.key);
	boolean right=new Scanner(System.in).nextBoolean();
	if(right) {
		n.right=new Node(new Scanner(System.in).nextInt());
		Populate(n.right);
	}
  }
public void PrettyDisplay() {
	PrettyDisplay(root, 0);
	}
private void PrettyDisplay(Node n, int level) {
	if(n==null) return;
	PrettyDisplay(n.right, level+1);
	if(level!=0)
		for(int i=0; i<level-1; i++) {
			System.out.print("|-");
	System.out.println("===>"+n.key);
		}else{
	System.out.println(n.key);
   }
	PrettyDisplay(n.left, level+1);
 }
}