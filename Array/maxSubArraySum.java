//MAXIMUM SUBARRAY
// BRUTE FORCE TIME O(N2)  SPACE O(1)   EASY

public class maxSubArraySum {
    public static void main(String[] srgs){
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0,maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxsum=Math.max(maxsum,nums[i]);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxsum);
    }
}

// OPTIMISE APPROACH   TIME O(N)  SPACE O(1)   EASY
// ADVANCE KADANE ALGO
// SIMPLE KANADE DO sum=0  if sum<0 means sum is negative
// SUM OF EVERY ELEMENT , CHECK IF THAT ELEMENT OF ARR IS GREATER PUT THAT ELEMNT NHI TOH SUM + THAT ELEMT. AGR SUM BDA MAXSUM SE DAAL DO


class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            sum=Math.max(nums[i],sum);
            if(sum>maxsum)maxsum=sum;
        }
        return maxsum;
    }
}

//leetcode 53