package com.section03;

public class Example06 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("");
		
		sb.append("Hello ");
		sb.append("Programming");
		System.out.println(sb);    //Hello Programming
		
		sb.insert(6, "Java ");     //Hello Java Programming
		System.out.println(sb);
		
		sb.replace(1, 4, "Good "); // 1~3 HGood o Java Programming
		System.out.println(sb);
		
		sb.delete(1, 5);           // 1~4 H o Java Programming
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);    // gnimmargorP avaJ o H
	}

}
