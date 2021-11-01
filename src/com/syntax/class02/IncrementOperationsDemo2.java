package com.syntax.class02;

public class IncrementOperationsDemo2 {

	public static void main(String[] args) {
		int nmbr = 10;
		nmbr = nmbr + nmbr + nmbr + nmbr;
		System.out.println(nmbr);
		nmbr = nmbr + 10 + 20 + 20;
		System.out.println(nmbr);
		System.out.println("***************************************");
		nmbr=nmbr-nmbr;
		System.out.println(nmbr);
		System.out.println("***************************************");
		nmbr=10;
		nmbr=nmbr*10;
		System.out.println(nmbr);
		System.out.println("***************************************");
		nmbr=10;
		nmbr--;
		System.out.println(nmbr);
	}

}
