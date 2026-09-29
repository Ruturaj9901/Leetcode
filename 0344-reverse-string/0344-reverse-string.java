class Solution {
    public void reverseString(char[]a ) {
        int n=a.length;
        int l=0;
        int r=n-1;

        while( l < r){
            char temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
    }
}