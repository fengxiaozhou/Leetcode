import java.util.Arrays;

public class solution31 {
	public static void nextPermutation(int[] nums) {
		int temp=0;
		int l=nums.length;
		for(int i=l-1;i>0;i--)
		{
			if(nums[i]>nums[i-1])
			{
				int p=i-1;
				for(int j=l-1;j>p-1;j--)
				{
					if(nums[j]>nums[p])
					{
					temp=nums[p];
					nums[p]=nums[j];
					nums[j]=temp;
					break;
					}
					
				}
				for(int k=p+1;k<(l+p+1)/2;k++)
				{
					temp=nums[k];
					nums[k]=nums[l-k+1];
					nums[l-k+1]=temp;
				}
				return;
			}
			
        }
		for(int i=0;i<l/2;i++)
		{
			temp=nums[i];
			nums[i]=nums[l-i-1];
			nums[l-i-1]=temp;
		}
	
	}
	public static void main(String[] args) {
		int a[]=new int[]{1,3,2};
		nextPermutation(a);
		System.out.println(Arrays.toString(a));
	}

}
