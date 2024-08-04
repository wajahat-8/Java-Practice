package unionfind;

public class ArmsStrong {
    public static void main(String[] args) {
        
        int N = 153; 
        boolean result = isArmstrong(N);   
        System.out.println("Is " + N + " an Armstrong number? " + result);
    }
    public static boolean isArmstrong(int N) {
    	int originalNumber=N;
    	int numberOfDigits=0;
    	int sum=0;
    	int temp=N;
    	while(temp!=0) {
    		temp/=10;
    		numberOfDigits++;
    	}
    	temp=N;
    	while(temp!=0) {
    		int digit=temp %10;
    		sum+=Math.pow(digit,numberOfDigits);
    		temp/=10;
    		
    				
    	}
    	
       
        return  sum==N?true:false;
    }
}
