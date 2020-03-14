package org.test;

public class Child extends Cons {
public Child() {
	super(100);
	System.out.println("child Default");
}
public Child(int ss)
{
	System.out.println("child");
	System.out.println(ss);
}

public static void main(String[] args) {
	Child c=new Child();
	Child c1=new Child(200);
}
}
