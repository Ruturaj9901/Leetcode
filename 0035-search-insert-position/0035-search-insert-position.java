class Solution {
    public int searchInsert(int[] a, int x) {
        int st=0;
        int end=a.length-1;
        
        while( st <= end){
            int mid=st+(end-st)/2;

            if( a[mid]==x){
                return mid;
            }else if( a[mid] < x){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return st;
    }
}