
public class SpecialCharacter {
	/*
	 * Given two strings identical but for one extra character in one string
	 * return the extra character.
	 */
	
	public char findChar(String in1, String in2){
		// implemented with binary search
		
		
		int end = (in1.length() > in2.length()) ? in1.length() - 1: in2.length() - 1;
		
		int start = 0;
		
		while(start != end){
			int mid = (start + end)/2;
			if(in1.charAt(mid) == in2.charAt(mid)){
				start = mid + 1;
			}
			else{
				end = mid;
			}		
		}
		char c = (in1.length() > in2.length()) ? in1.charAt(start) : in2.charAt(start);
		return c;
	}
	
	public static void main(String[] args){
		SpecialCharacter test = new SpecialCharacter();
		System.out.println(test.findChar("he*rl", "herl"));
		
	}

}
