import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		
		
	int[] arr =	{7,4,10,8,3,1};
      selectionSort(arr);
	}

	private static void selectionSort(int[] a) {
		
		int lenght = a.length;
		
		for(int i=0; i<lenght-1; i++) {
		for(int j=1; j<lenght; j++ ) {
			
			if(a[i] > a[j] && i!=j) {
				
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
	}}}
		
		for(int i=0; i< a.length; i++) {
			System.out.println(a[i]);
	}}}