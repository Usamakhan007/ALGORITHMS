

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] array= {5,2,3,1};
		
		int [] res = bubbleSort(array);
		
		for(int k=0; k<array.length; k++) {
			
			System.out.println(res[k]);
	}
}

	private static int[] bubbleSort(int[] arr) {
		
		int lenght = arr.length;
		
		for(int i = 0; i< lenght-1; i++) {
		
			for(int j=0; j<lenght-1-i; j++){
			
				if(arr[j] > arr[j+1]) {
			
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		
			}}}
		return arr;
}}
