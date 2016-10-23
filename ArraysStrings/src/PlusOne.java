
public class PlusOne {

	public int[] plusOne(int[] digits) {
        
        boolean carryOver = false;
        int mSD = digits[digits.length - 1] + 1;
        
        if(mSD < 10){
            digits[digits.length - 1] = mSD;
            
        }
        
        else {
            digits[digits.length - 1] = 0;
            carryOver = true;
            int i = digits.length - 2;

            while(carryOver == true && i >= 0){
                
                int result = digits[i] + 1;
                if(result < 10){
                    digits[i] = result;
                    carryOver = false;
                } else {
                    digits[i] = 0;
                }
                i--;
            }
            if(carryOver == true){
                int[] overflow = new int[digits.length + 1];
                overflow[0] = 1;
                for(int j = 1; j < overflow.length; j ++){
                    overflow[j] = digits[j - 1];
                }
                return overflow;
            }
            
        }
        return digits;
        
        
    }
}
