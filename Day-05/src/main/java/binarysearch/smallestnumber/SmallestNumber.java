package binarysearch.smallestnumber;

import static java.lang.Math.min;

public class SmallestNumber {

    public static int binarysearch(int[] arr){

        int mid,left=0,right=arr.length-1;

        int ans = Integer.MAX_VALUE;

        while(left<=right){
            mid = left+(right-left)/2;

            if(arr[mid]>=arr[left]){
                ans = min(ans,arr[left]);
                left = mid+1;
            }
            else{
                ans = min(ans,arr[mid]);
                right = mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Smallest Element is  "+binarysearch(new int[]{6,7,8,1,2,3,4,5}));
    }
}
