import java.util.Arrays;

public class MergeSort{
	
	public static void main(String[] args) {
		
		int[] arr = {10 , 20 , 5};
		int[] temp = new int[arr.length];
		
		mergeSort(arr, temp, 0, arr.length-1);
		
		for(int i: arr) {
			
			System.out.println(i);
		}
	}
private static void mergeSort (int [] array, int [] temp, int leftStart, int rightEnd) {
		if (leftStart >= rightEnd) {	
			return;
}
		int middle = (leftStart + rightEnd)/2;
		mergeSort(array, temp, leftStart, middle);
		mergeSort (array, temp, middle+1, rightEnd);
		mergeHalves (array, temp, leftStart, rightEnd);
	}


private static void mergeHalves (int [] array, int [] temp, int leftStart, int rightEnd) {
	
		int leftEnd = (rightEnd + leftStart)/2;
		int rightStart = leftEnd+1;
		int size = rightEnd-leftStart +1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while (left<=leftEnd && right<=rightEnd) {

			if(array[left] <= array[right]) {		
				temp[index] = array[left];
				index++; left++;

			} else {

				temp[index] = array[right];
				index++; right++;
			}}

System.arraycopy(array, left, temp, index, leftEnd-left+1);
System.arraycopy(array, right, temp, index, rightEnd-right+1);
System.arraycopy(temp, leftStart, array, leftStart, size);	
}
}





