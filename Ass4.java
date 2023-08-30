package Ass_1D;

import java.util.Arrays;

public class Ass4 {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,43};
        int arr2[]={4,3,6,7,1};

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println("The largest element in the first array is: "+arr[arr.length-2]);
        System.out.println("The largest element in the second array is: "+arr2[arr2.length-2]);
    }
}
