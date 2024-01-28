package pp_practice_Qsn;

import java.util.Arrays;
//<aside>
//💡 You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//</aside>
public class Array1_Ass5 {
    public static void main(String[] args) {


        int arr1[] = {1, 2, 3, 0, 0, 0};
        int arr2[] = {2, 5, 6};
        int res[]=func(arr1,arr2);
        for(int x: res){
            System.out.print(x+" ");
        }
    }
    public static int[] func(int arr1[],int arr2[]){
        int n=0;
        for(int x:arr1){
            if(x==0){
                break;
            }
            n++;
        }
        int j=0;
        for(int i=n;i<arr1.length;i++){
            arr1[i]=arr2[j++];
        }
        Arrays.sort(arr1);
        return arr1;
    }
}

