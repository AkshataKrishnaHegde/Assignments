package Ass_2D;

import java.util.Scanner;

public class Ass2D1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println("Enter the number of columns");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int positiveNumbers=0;
        int negativeNumbers=0;
        int oddNumbers=0;
        int evenNumbers=0;
        int noOfZeros=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>0){
                    positiveNumbers++;
                } else if (arr[i][j]<0) {
                    negativeNumbers++;
                }
                else{
                    noOfZeros++;
                }
                if(arr[i][j]%2==0){
                    evenNumbers++;
                }
                else{
                    oddNumbers++;
                }
            }
        }
        System.out.println("The number of Positive Numbers: "+positiveNumbers);
        System.out.println("The number of Negative Numbers: " +negativeNumbers);
        System.out.println("The number of odd numbers: "+oddNumbers);
        System.out.println("The number of even numbers: "+evenNumbers);
        System.out.println("The number of zeroes: "+noOfZeros);
    }
}
