//LONGEST SUBARRAY WITH SUM K

//BRUTE TIME=O(N2)  SPACE =O(1) EASY
//THINK
// To make all the the subset it goes O(n3) . but we reduce to O(n2) if we only need sum.
// Simple make all possible pair sum and compare to k.Remeber to make sum=0.

// public class subarray{
//     public static void main(String[] args){
//          int[] arr={1,2,3,1,1,1,1};
//          int sum=0,maxlen=0;
//          int k=3;
//          for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 sum+=arr[j];
//                 if(sum==k){
//                     maxlen=Math.max(maxlen,j-i+1);
//                 }
//             }
//             sum=0;
//          }
//          System.out.println(maxlen);
//     }
// }

//BETTER  TIME=O(N) SPACE=O(N)  HARD  OPTIMAL FOR POSITIVE & NEGATIVE
// Using MAp
// total sum , k , rem=sum-k.
// if rem is in hashmap means we get.
// put sum in hashmap with index but only for unique entry.


// import java.util.HashMap;
// import java.util.Map;
// public class subarray{
//     public static void main(String[] args){
//         Map<Long,Integer> mapp=new HashMap<>();
//         int[] arr={1,1,0,0,0,2,2,3,4,5};
//         int k=7;
//         int len=0,res=0;
//         long sum=0;
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             sum+=arr[i];
//             long rem=sum-k;
//             if(sum==k){
//                 len=i+1;
//             }
//             if(mapp.containsKey(rem)){
//                 len=i-mapp.get(rem);
//                 res=Math.max(res,len);
//             }

//             if(!mapp.containsKey(sum)){
//                 mapp.put(sum,i);
//             }
//         }
//         System.out.print(res);
//     }
// }


//OPTIMAL  TIME=O(2N) OR O(N)  SPACE=O(1)  EASY  IF ELEMENT IS ALL POSITIVE
// 2 POINTER
// 3 CONDITION 
// UP , DOWN . up increment as on. sum==k we get. if sum>k then subtract down val. rather do sum all element.


public class subarray{
    public static void main(String[] args){
        int[] arr={1,2,3,1,1,1,1};
        int i=0,j=0,maxlen=0,n=arr.length,sum=0;
        int k=3;
        while(i<n){
            sum+=arr[i];
            while(j<=i && sum>k){
                sum-=arr[j];
                j++;
            }
            if(k==sum){
                maxlen=Math.max(maxlen,i-j+1);
            }
            i++;
        }
        System.out.println(maxlen);

    }
}




//IMPORTANT  TAGS AND LINKS
//LEETCODE 560
//GFG : Longest Subarray with Sum K
//CODING NINJA : Longest Subarray With Sum K






