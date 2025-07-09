MASTER SUBARRY SUM , MAXIMUM SUBARRAY SUM , MAXIMUM SUBARRAY ELEMENT , MAXIMUM SUBARRAY TAKE ONLY POSITIVE ELEMMENT

//MAXIMUM SUBARRAY KADANE YO YO 
//TIME O(N)  SPACE O(1)   EASY

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


//MAXIMUM SUBARRAY SUM WANTED ELEMNT OR INDEX 
// MODIFIED KADANE 

// start,end sum,maxsum,startans,endans

// IMPORTANT IMPORTANT harr nya subarray start hone se pehle sum 0 hogs and agr sum>subarray iski andar ja rhe hai tabhi vh elemnt add hoga subarray me
// 3 steps
// add sum continuesly
// if(sum>maxsum)  then maxsum=sum  reset start end
// if sum==0 start reset
// if sum<0   sum=0

    
import java.util.*;
public class maxSubArraySum{
    public static void main(String[] args){
        int arr[]={1, 2, 5, -7, 2, 6};
        int sum=0,maxsum=Integer.MIN_VALUE,start=-1,end=-1,startans=-1,endans=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0){start=i;}
            sum+=arr[i];
            if(sum>maxsum){
                maxsum=sum;
                startans=start;
                endans=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=startans;i<=endans;i++){
            res.add(arr[i]);
        }
        System.out.println(startans);
        System.out.println(endans);

        for(int i:res){
            System.out.print(i);
        }
    }
}


// TO FIND the MAXIMUM SUBARRAY ELEMENT OR INDEX 
// MODIFIES KADANE

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        ArrayList<Integer> res=new ArrayList<>();
        int sum=0,maxsum=Integer.MIN_VALUE;
        int start=0,end=0,neg=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                sum=0;
                neg=i;
                continue;
            }
            sum+=arr[i];
            if(sum>maxsum || (sum==maxsum && (i-(neg+1))>(end-start))){
                maxsum=sum;
                start=neg+1;
                end=i;
            }
        }
        
        for(int i=start;i<=end;i++){
            if(arr[i]>=0){
                
            res.add(arr[i]);
            }
        }
        
        if(res.size()==0){
            res.add(-1);
        }
        
        return res;
    }
}


//Kadane's Algorithm  gfg
//leetcode 53
//Maximum Sub Array gfg
