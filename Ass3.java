package Ass_1D;

public class Ass3 {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,43};
        int arr2[]={4,3,6,7,1};
        int max1=0;
        int max2=0;
        for(int n: arr){
            if(n>max1){
                max1=n;
            }
        }
        for(int n:arr2){
            if(n>max2){
                max2=n;
            }
        }
        System.out.println("Maximum element present in the 1st input: "+max1);
        System.out.println("Maximun element present in the 2nd input: "+max2);
    }
}
