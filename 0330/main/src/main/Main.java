package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		System.out.println(">");
	      Scanner s=new Scanner(System.in);
	      int in=s.nextInt();
	      
	      for(int i=in; i>=0; i--) {
	         for(int j=(2*i)-1; j>0; j--) {
	            System.out.print("*");
	         }System.out.println();
	      }
	}
}
