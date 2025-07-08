// INTERSECTION WITH NO DUPLICATE (UNIQUE INTERSECTION)
// TIME O(N+M+K) O(N+M)
// SPACE O(N+K+MIN(N,M))  O(N+M)
// USING SET

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        
        for(int i:nums1){
            set.add(i);
        }

        for(int j:nums2){
            if(set.contains(j)){
                res.add(j);
            }
        }
        int l=0;
        int[] resarr=new int[res.size()];
        for(int k:res){
            resarr[l++]=k;
        }

        return resarr;
    }
}


// 2 POINTER
// ONLY IF ARR IS SORTED
// TIME O(N+M) SPACE O(1) 

class Solution {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> intersection(int a[], int b[]) {
                int n=a.length,m=b.length,i=0,j=0;
        ArrayList<Integer> inter=new ArrayList<>();
        while(i<n && j<m){
            if(a[i]==b[j]){
                if(inter.size()==0 || inter.get(inter.size()-1)!=a[i]){
                    inter.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return inter;
    }
}



// gfg Intersection of Two Sorted Arrays with Duplicate Elements
// leetcode 350
// leetcode 349
