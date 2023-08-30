package Ass_2D;

import java.util.Scanner;

public class Ass2D4 {
    public static void main(String[] args) {
        int max=0;
        int arr[][]={{1,2,4,0},{2,5,7,-1},{4,2,6,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Maximum element in the array is: "+max);
    }
}
