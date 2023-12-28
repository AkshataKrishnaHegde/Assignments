package Assignments_DSA;

import java.util.Scanner;

public class bit_3 {
    public static int findOddOccurring(int[] arr){
        int xor=0;
        for(int i:arr){
            xor=xor^i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr2[]={4,4,5,5,5};
        System.out.println("The odd occurring element is"+findOddOccurring(arr2));
    }
}
