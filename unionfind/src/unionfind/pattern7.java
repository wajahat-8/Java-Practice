package unionfind;

public class pattern7 {
	  public static void main(String[] args) {
		  for(int i=0;i<6;i++) {
			  for(int j=0;j<=6-i-1;j++) {
				  System.out.print(" ");			  
		  }
		  
		  char ch='A';
		  int breakpoint=(2*i+1)/2;
		  for(int j=1;j<=2*i+1;j++) {
			  System.out.print(ch);
			  if(j<=breakpoint) ch++;
			  else ch--;
		  }
		  for(int j=0;j<6-i-1;j++) {
			  System.out.print(" ");	
		  }
		  System.out.println();
	  }
	  }
		  
	  }


	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  