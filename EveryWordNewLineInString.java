package october08;

public class EveryWordNewLineInString {
	public static void main(String [] args) {
		String str = "My name is Wajhul Huda";
		String[] str1= str.split(" ");
		for(int i=0; i<str1.length; i++) {
			System.out.println(str1[i]);
		}
	}

}
