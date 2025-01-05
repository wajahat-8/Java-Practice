package math;

import java.util.Iterator;

public class SieveOfEratosthenes {
	public static void sieve(int n) {
		boolean[] isPrime=new boolean[n+1];
		for(int i=0;i<=n;i++){
			isPrime[i]=true;
		}
		isPrime[0]=isPrime[1]=false;
		
		for(int i=2;i*i<=n;i++) {
			if(isPrime[i]) {
				for(int j=i*i;j<=n;j+=i) {
					isPrime[j]=false;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(isPrime[i]) {
				System.out.print(i+" ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int n=50;
		sieve(n);
	}

}
