
public class StringCompression {
	public String compress(String in){
		char[] chars = in.toCharArray();
		
		// check in advance the length of compression so we don't create a string
		// we won't use in some cases, and also to initialize StringBuilder length
		int unique = countUnique(in);
		if((unique*2) > in.length()){
			return in;
		}
		StringBuilder str = new StringBuilder(unique*2);
		str.append(chars[0]);
		int ct = 1;
		for(int i = 1; i < chars.length; i++){
			if(chars[i] != chars[i - 1]){
				str.append(ct);
				ct = 1;
				str.append(chars[i]);
			}
			else {
				ct++;
			}
		}
		str.append(ct);
		return str.toString();
	}
	
	public int countUnique(String in){
		int ct = 1;
		char[] chars = in.toCharArray();
		for(int i = 1; i < chars.length; i++){
			if(chars[i] != chars[i - 1]){
				ct++;
			}
		}
		return ct;
	}
	public static void main(String[] args){
		StringCompression test = new StringCompression();
		System.out.println(test.compress("aaabbbbbcdfffffffff"));
	}
}
