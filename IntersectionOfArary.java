package october08;

public class IntersectionOfArary {
	public static void main(String [] args) {
		int a1[]= {2,3,1,4,2,8,6};
		int a2[]= {3,4,5,7,9};
		
		for(int i=0; i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					System.out.print(a1[i]+" ");
				}
			}
		}
	}

}
