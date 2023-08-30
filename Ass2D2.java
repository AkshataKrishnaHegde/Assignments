package Ass_2D;

import java.util.Scanner;

public class Ass2D2 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows of square matrix");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println("Enter the number of columns of square matrix");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter the matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i+j!=m-1 && i+j<m-1){
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}
