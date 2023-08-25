package RecursionAssignment;

import java.util.Scanner;

public class Qsn2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=sum(n);
        System.out.println("The result is:"+res);
    }
    public static int sum(int n){
        if(n<1){
            return 0;
        }
        else if(n%2==0){
            return -n+sum(n-1);
        }
        else{
            return n+sum(n-1);
        }
    }
}
