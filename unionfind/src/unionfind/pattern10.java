package unionfind;

public class pattern10 {
	 public static void main(String[] args) {
		 int spaces =2*5-2;
		 for(int i=1;i<=2*5-1;i++) {
			 int stars=i;
			 if(i>5) stars=2*5-i;
			 for(int j=1;j<=stars;j++) {
				 System.out.print("*");
			 }
			 for(int j=1;j<=spaces;j++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=stars;j++) {
				 System.out.print("*");
				 
			 }
			 System.out.println();
			 if(i<5) spaces -=2;
			 else spaces+=2;
			 
			 
			 
		 }
		 
		 
	 }

}
