public class Main_QuickSort {	
public static void main(String[] args) {
	
		int[] a = {5, 1, 4, 3, 2};
		Main_QuickSort ob = new Main_QuickSort();
		QuickSort(a, 0, a.length-1);
		ob.Display(a);
    }

public static void QuickSort(int[] arr, int left, int right) {	
	
	if(left >= right) {return;}
	int pivot = arr[(left + right)/2]; //pivot value
	int index = partition(arr, left, right , pivot);
		QuickSort(arr, left, index-1);
		QuickSort(arr, index, right);}

public static int partition(int [] arr, int left, int right, int pivot) {	
	while(left <= right) {
		while(arr[left] < pivot) {
			left++;
	}
		while(arr[right] > pivot) {	
			right--;
	}
			if(left <= right) {
			swap(arr, left, right);
				left++;
				right--;
		}}
				return left;
	}
public static void swap(int[] arr, int i, int j) {			
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;	
		}	

public void Display(int[] arr) {
		for(int k=0; k < arr.length; k++) {	
			System.out.println(arr[k]);
		}
	}
}
