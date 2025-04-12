package algorithm;

import java.util.Scanner;

public class Missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        int n = sc.nextInt();
        
    
        long totalSum = (long) n * (n + 1) / 2;
        long givenSum = 0;  
        
        for (int i = 0; i < n - 1; i++) {
         
            givenSum += sc.nextInt();
        }
        
        System.out.println( totalSum - givenSum);
        sc.close();
    }
}
