package october08;

public class CountTotalNumberofPunctuationChar {
	public static void main(String []args) {
		String str ="He said, 'The mailman loves you.'I heard it with my own ears.";
		str = str.toLowerCase();
		
		int count =0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if((ch>='a'&& ch<='z')|| ch==' ') {
				continue;
			}
			else {
				count++;
			}
		}
		System.out.println(count);
	
	}

}
