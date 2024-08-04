package unionfind;

public class pattern9 {
	public static void main(String[] args) {
		int inis=0;
		for(int i=0;i<5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<inis;j++) {
				 System.out.print(" ");
			}
				 for(int j=1;j<=5-i;j++) {
					 System.out.print("*");
				 }
				 inis+=2;
				 System.out.println();
			}
		inis=2*5-2;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			for(int j=0;j<inis;j++) {
				 System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {
				 System.out.print("*");
				
			}
			inis-=2;
			  System.out.println();
		}
		}
		
	}


