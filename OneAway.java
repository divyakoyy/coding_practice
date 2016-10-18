
public class OneAway {
	
	public boolean oneCharAway(String str1, String str2){

		if(str1.length() == str2.length()){
			return oneReplaceAway(str1, str2);
		}
		if(str1.length() == str2.length() - 1){
			return oneInsertAway(str1, str2);
		}
		if(str2.length() == str1.length() - 1){
			return oneInsertAway(str2, str1);
		}
		
		return false;
		
	}	

	public boolean oneReplaceAway(String str1, String str2){
		
		char[] chars_1 = str1.toCharArray();
		char[] chars_2 = str2.toCharArray();
		int diffsFound = 0;
		
		for(int i = 0; i < chars_1.length; i++){
			if (chars_1[i] != chars_2[i]){
				diffsFound++;
			}
		}
		if(diffsFound == 1){
			return true;
		}
		
		return false;
	}
	public boolean oneInsertAway(String str1, String str2){
		char[] chars_1 = str1.toCharArray();
		char[] chars_2 = str2.toCharArray();
		int diffsFound = 0;
		int i = 0;
		int j = 0;
		while(i < chars_1.length && j < chars_2.length){
			if (chars_1[i] != chars_2[j]){
				diffsFound++;
				j++;
			}
			else{
				i++;
				j++;
			}
			
		}
		if(diffsFound <= 1){
			return true;
		}
		
		return false;
		
	}

	public static void main(String[] args){
		OneAway one = new OneAway();
		System.out.println(one.oneCharAway("pale", "bake"));
	}
}

