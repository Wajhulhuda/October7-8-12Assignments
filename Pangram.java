package october08;

public class Pangram {
	public static void main(String [] args) {
		String str = "Abcdefghiklmnopqrstuvwxyz";
		str= str.toLowerCase();
		boolean ispangram = checkPanagram(str);
		System.out.println(ispangram);
	}
	public static boolean checkPanagram(String str) {
		for(char i='a'; i<='z';i++) {
			String value = String.valueOf(i);
			if(str.contains(value)) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}

}
