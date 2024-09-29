package sortingalgos;

public class Shellsort {
	public static void sort(Comparable[] a) {
		
int N=a.length;
int h=1;
while (h<N/3) h=3*h+1;
while(h>=1) {
for (int i = h; i < N; i++) {{
	for (int j = h; j>=h&&a[j].compareTo(a[j-h])<0; j-=h) {
		Comparable temp=a[j];
		a[j]=a[j-h];
		a[j-h]=temp;
		
		
	}
}
h=h/3;
}	
}
	}
	
 public static void main(String[] args) {
		        Integer[] arr = {34, 2, 45, 6, 12, 33, 21, 10};
		        Shellsort.sort(arr);

		        // Print sorted array
		        for (int i : arr) {
		            System.out.print(i + " ");
		        }
		
	}

}
