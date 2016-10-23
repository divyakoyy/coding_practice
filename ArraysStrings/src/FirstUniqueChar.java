
public class FirstUniqueChar {
	
	public int firstUniqChar(String s) {
        
        if(s.length() <= 1){
            return s.length() - 1;
        }
        
        int[] cts = new int[256];
        
        for(int i = 0; i < s.length(); i++){
            int val = s.charAt(i);
            cts[val] += 1;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(cts[s.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }

}
