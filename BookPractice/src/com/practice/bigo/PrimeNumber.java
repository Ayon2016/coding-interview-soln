package com.practice.bigo;

public class PrimeNumber {
	
	static boolean isPrime(int n) {
		for(int x=2; x<=Math.sqrt(n);x++) {
			System.out.println(n%x);
			if(n%x==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(11));
	}

}
