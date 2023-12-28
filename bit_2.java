package Assignments_DSA;

import java.util.Scanner;

public class bit_2 {
    public static int countSetBits(int n){
        int c=0;
        while(n>0){
            c+=n&1;
            n>>=1;
        }
        return c;
    }

    public static void main(String[] args) {
        int number=9;
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        number=sc.nextInt();
        int ans=countSetBits(number);
        System.out.println("The number of set bits in the given number are "+ans);
    }
}
