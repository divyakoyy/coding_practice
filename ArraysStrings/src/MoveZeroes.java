
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
        if(nums.length <=1){
            return;
        }

        int swapIndex = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, swapIndex);
                swapIndex++;
            }
            
        }
        
    }
    
    public void swap(int[] nums, int i, int swapIndex){
        if(i != swapIndex){
            nums[swapIndex] = nums[i];
            nums[i] = 0;
        }
        
    }

}
