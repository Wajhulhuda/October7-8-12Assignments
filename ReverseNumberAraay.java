package october08;

public class ReverseNumberAraay {
	public static void main(String [] args) {
		int arr1[] = {1,2,3,4,5};
		int index =0;
		int[] arr2= new int[arr1.length];
		for(int i=arr1.length-1; i>=0;i--) {
			arr2[index] = arr1[i];
			index++;
			
			
		}
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

}
