//UNION OF 2 SORTED ARRAY 
//POINTER APPROACH
// TIME O(n+m)  space O(1)


class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> union=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                if(union.size()==0 || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        
        while(i<n){
            if(union.size()==0 || union.get(union.size()-1)!=a[i]){
                union.add(a[i]);
            }
            i++;
        }
        
         while(j<m){
            if(union.size()==0 || union.get(union.size()-1)!=b[j]){
                union.add(b[j]);
            }
            j++;
        }
        
        return union;
    }
}



// WHEN ARRAY IS NOT SORTED 
// Time Complexity: O(n + m)  Space Complexity: O(n + m)
// USING SET

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        for(int j:b){
            set.add(j);
        }
        return new ArrayList(set);
        
    }
}


//gfg Union of Arrays with Duplicates
//gfg Union of 2 Sorted Arrays
