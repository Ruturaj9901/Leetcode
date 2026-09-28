class Solution {
    public int[] searchRange(int[] a, int x) {
        int n=a.length;
           int st=0;
           int end=n-1;
           int ans[]={-1,-1};

           while( st <= end){
            int mid=st+(end-st)/2;

            if( a[mid]==x){
                ans[0]=mid;
                end=mid-1;
            }else if( a[mid] < x){
                st=mid+1;
            }else{
                end=mid-1;
            }
           }
               st=0;
               end=n-1;

           while( st <= end){
            int mid=st+(end-st)/2;

            if( a[mid]==x){
                ans[1]=mid;
                st=mid+1;
            }else if( a[mid] < x){
                st=mid+1;
            }else{
                end=mid-1;
            }
           }
           return ans;
    }
}