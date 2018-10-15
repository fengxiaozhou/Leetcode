
public class ContainerWithMostWater {
    public int maxArea(int[] height) 
    {
    	int max=0,s=0;
    	int left=0;
    	int right=height.length-1;
    	while(left>right){
    		s=(right-left)*Math.min(height[right],height[left]);
    		max=Math.max(s, max);
    		if(height[right]>height[left])
    			left++;
    		else right++;
    		
    	}
    
    	return max;   
    }
}
