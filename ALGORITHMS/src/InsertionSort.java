
public class InsertionSort {
	public static void main(String[] args) {
		
		
		int[]  a = {10 , 2 , 6 , 4 , 0 , 8};
		int[] res = insertionSort(a);
		
		
		for(int i=0; i < a.length; i++){
		  System.out.println(res[i]);
		}
	}

	private static int[] insertionSort(int[] a) {
        // 2 6 10 4 0 8]
			for(int i=1; i< a.length; i++) { 		
			int temp = a[i];      
			int j = i-1;    
			while(j>=0 && a[j] > temp) // 10 > 2 
			{  
			a[j+1] = a[j];            // 2 10 
			j--;                     
			}
			a[j+1] = temp;         // 2 10  
		}
		return a;
	}
}
