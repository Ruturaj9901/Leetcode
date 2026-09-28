class Solution {
    public float findMedianSortedArrays(int[] a1, int[] a2) {
        int i=0,j=0,k=0;

        int m[]=new int[a1.length+a2.length];

        while( i < a1.length && j<a2.length){
            if( a1[i] < a2[j]){
                m[k]=a1[i];
                i++;
                k++;
            }else{
                m[k]=a2[j];
                j++;
                k++;
            }
        }

        while( i < a1.length){
             m[k]=a1[i];
                i++;
                k++;
        }

        while( j < a2.length){
             m[k]=a2[j];
                j++;
                k++;
        }

        if( m.length%2 ==0){
            int mid=m.length/2;
            return (float)(m[mid-1]+m[mid])/2;
        }else{
            int mid=m.length/2;
            return m[mid];
        }
    }
}