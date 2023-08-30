package Ass_1D;

public class Ass2 {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,43};
        int arr2[]={4,3,6,7,1};
        System.out.println("Even elements present in the first input array:");
        for(int n: arr){
            if(n%2==0){
                System.out.println(n);
            }
        }
        System.out.println("Even Elements present in 2nd input array: ");
        for(int n: arr2){
            if(n%2==0){
                System.out.println(n);
            }
        }
    }
}
