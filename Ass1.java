package Ass_1D;

public class Ass1 {
    public static void main(String[] args) {
        int arr[]={3,20,4,6,9};
        int arr2[]={4,3,6,7,1};
        int sum1=0;
        int sum2=0;
        for(int i=0; i<arr.length;i=i+2){
            sum1+=arr[i];
        }
        for (int i=0;i<arr2.length;i=i+2){
            sum2+=arr2[i];
        }
        System.out.println("Sum of 1st input is :"+sum1); //output:16
        System.out.println("Sum of second input is:"+sum2);//output:11
    }
}
