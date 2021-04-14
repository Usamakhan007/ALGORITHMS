
//Java program for implementation of QuickSort 
class Demo { 
	
	private int partition(int arr[], int begin, int end, int pivot) {
	    
		while(begin < end) {
	    while(arr[begin] < pivot) {
	    	begin++;
	    }

	    while(arr[end] > pivot) {	
	    	end--;
	    } 
	    }
	      if (arr[begin] <= pivot) {
	      swap(arr, begin, end);   
	            begin++;
	            end--;
	        }
	        return begin;
	    }
	
	public void quickSort(int arr[], int begin, int end) {
		
		int pivot = arr[(begin + end)/2];
		
		if (begin < end) {
	        int partitionIndex = partition(arr, begin, end, pivot);
	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex, end);
	    }
	} 

	
	public static void main(String args[]) 
	{ 
		int arr[] = {10, 7, 8, 9, 1, 5}; 
		int n = arr.length; 
		Demo ob = new Demo(); 
		ob.quickSort(arr, 0, n-1); 
		System.out.println("sorted array"); 
		printArray(arr); 
	} 
	
	public static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;	
}	
	
	static void printArray(int arr[]) { 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
		System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 
} 

