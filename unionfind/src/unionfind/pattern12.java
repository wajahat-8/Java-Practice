package unionfind;

public class pattern12 {
	 public static void main(String[] args) {
		 for(int i=0;i<2*5-1;i++) {
			 for (int j=0;j<2*5-1;j++) {
				 int top = i;
				 int bottom = j;
				 int right =(2*5-2)-j;
				 int left=(2*5-2)-i;
				
	             System.out.print(5-Math.min(Math.min(top, bottom),Math.min(left, right))+" ");
				 
			 }
			  System.out.println();
		 }
		 
	 }

}
