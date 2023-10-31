package DivideAndConquer;
//Q1. Given an array where all its elements are sorted in increasing order except two swapped elements, sort it
//in linear time. Assume there are no duplicates in the array.
public class Ass1 {
    public static void main(String[] args) {
        int[] arr={1,4,7,6,8};
        int i=-1; int j=-1;
        int prev=arr[0];
        for(int r=1; r<arr.length;r++){
            if(arr[r]<prev){
                int temp=arr[r];
                arr[r]=prev;
                arr[r-1]=temp;
            }
            prev=arr[r];
        }

        for (int n:arr){
            System.out.print(n + " ");
        }
    }

}
