package october08;

public class VowelConsonent { 
	public static void main(String [] args) {
		String str = "This is a really simple sentence";
		str= str.toLowerCase();
		int vowel=0, consonent=0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a'&& ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowel++;
				}else
				{
					consonent++;
				}
			}
		}
		System.out.println("Vowels : "+vowel+" Consonents : "+consonent);
	}

}
