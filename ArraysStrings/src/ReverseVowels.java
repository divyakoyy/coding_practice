
public class ReverseVowels {

	public String reverseVowels(String s) {
        if(s.length() <= 1){
            return s;
        }
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        
        while(i < j){
            
            if(isVowel(chars[i]) && isVowel(chars[j])){
                swap(chars, i, j);
                i++;
                j--;
            }
            else if (!isVowel(chars[i])){
                i++;
            }
            else if (!isVowel(chars[j])){
                j--;
            }
        }
         
        return new String(chars);
        
    }
    
    public void swap(char[] chars, int i , int j){
        if(i != j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }
    public Boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;
    }
}
