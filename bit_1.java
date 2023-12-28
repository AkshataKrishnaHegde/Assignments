package Assignments_DSA;

import java.util.Scanner;

public class bit_1 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the integer: ");
        Scanner sc=new Scanner(System.in);
        number= sc.nextInt();
        if((number&1)==1){
            System.out.println("Given number is odd");
        }
        else{
            System.out.println("Given number is even");
        }
    }
}
