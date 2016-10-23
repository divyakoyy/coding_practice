
public class ReverseString {
	public String reverseString(String s) {
        if(s.length() <= 1) {
            return s;
        }
        StringBuilder str = new StringBuilder(s.length());
        
        for(int i = s.length() - 1; i >=0; i--){
            str.append(s.charAt(i));
        }
        return str.toString();
        
    }
}
