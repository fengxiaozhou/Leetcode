import java.util.Arrays;

public class sum {
	public static  int[] twoSum(int[] nums, int target) {
        int[] s=new int[2];
		int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]>target)
                j--;
            else if(nums[i]+nums[j]<target)
                   i++;
        	    else
        		    {	
                        s[0]=i+1;
                        s[1]=j+1;
                    }
        }
        return s; 
	}
	
	public static void main(String[] args) {
		int[] a=new int[]{2,3,4};
		int target=6;
		int[] b;
		b=twoSum(a, target);
		System.out.println(Arrays.toString(b));
	}
}
