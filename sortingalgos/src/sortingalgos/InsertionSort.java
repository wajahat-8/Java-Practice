package sortingalgos;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        int n = array.length;
       for(int i=1;i<n;i++) {
    	   for(int j=i;j>0;j--) {
    		   if (array[j]<array[j-1]) {
    			   int temp=array[j-1];
    			   array[j-1]=array[j];
    			   array[j]=temp;
				
			}
    		   else {
				break;
			}
    	   }
       }
				
			
        
  
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
