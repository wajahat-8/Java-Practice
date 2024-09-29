package sortingalgos;
import java.util.Random;

public class Shuffle {
	private static final Random random=new Random();
	public static void shuffle(Object[] a) {
		int N=a.length;
		for (int i = 0; i < N; i++) {
			int r=uniform(i+1);
			exch(a, i, r);
			
		}
		}
	public static int uniform(int n) {
		return random.nextInt(n);
	}
	private static void exch(Object[] a,int i,int j) {
		Object temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	 public static void main(String[] args) {
	        // Example usage
	        String[] array = {"A", "B", "C", "D", "E"};
	        
	        System.out.println("Before shuffling:");
	        for (String s : array) {
	            System.out.print(s + " ");
	        }
	        System.out.println();

	        // Shuffle the array
	        shuffle(array);

	        System.out.println("After shuffling:");
	        for (String s : array) {
	            System.out.print(s + " ");
	        }
		
	}

}
