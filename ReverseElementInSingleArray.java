package october08;

public class ReverseElementInSingleArray {
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,5};
		int p2= arr.length-1;
		for(int i=0; i<arr.length/2;i++) {
			
				int temp = arr[p2];
				arr[p2]= arr[i];
				arr[i]=temp;
				p2--;
			
			
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
