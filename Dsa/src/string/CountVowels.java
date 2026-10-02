package string;

public class CountVowels {

	public static void main(String[] args) {
		String s = "programming";
		int count=0;
		
		for(char i= 0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			if(ch == 'a'|| ch=='e'||ch =='i'|| ch=='o'|| ch=='u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
