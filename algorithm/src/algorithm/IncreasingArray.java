package algorithm;

import java.util.Scanner;

public class IncreasingArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		long[] arr=new long[n];
		for (int i = 0; i < n; i++) {
			arr[i]=scanner.nextLong();
			
			
		}
		long moves=0;
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				moves+=arr[i-1]-arr[i];
				arr[i]=arr[i-1];
			}
		}
		System.out.println(moves);
		
	}

}
