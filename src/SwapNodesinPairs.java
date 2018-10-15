import java.util.ArrayList;

public class SwapNodesinPairs {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length==0)  
            return 0;  
        int index = 1;  
        for(int i=1;i<nums.length;i++)  
        {  
            if(nums[i]!=nums[i-1])  
            {  
            	nums[index]=nums[i];  
                index++;  
            }  
        }  
        return index;  
        
    }
    
    public static void main(String[] args) {
		int a[]=new int[]{1,1,1,2,2,3};
		System.out.println(removeDuplicates(a));
		
	}

}
