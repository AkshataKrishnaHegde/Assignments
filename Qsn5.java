package RecursionAssignment;

import java.util.Scanner;

//checking armstrong number or not
public class Qsn5 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=func(n);
        if(n==res){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("it is not an armstrong number");
        }

    }
    public static int func(int n){
        int digit=0;
        int r=0;
        if(n<1){
            return 0;
        }
        else {
            r=n%10;
            return (r*r*r)+func(n/10);
        }
    }
}
