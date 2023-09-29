package BackTracking;
//Q1. Given an integer array arr and an integer k, return true if it is
//possible to divide the vector into k non-empty subsets with equal
//sum.
public class Ass1 {
    public static void main(String[] args) {
        int arr[]={1,3,2,2};
        int k=2;
        System.out.println(isPartitionPossible(arr,k));

    }
    public static boolean isPartitionPossible(int arr[], int k){
        int sum=0;
        int[] vis= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            vis[i]=0;
        }
        for(int j=0; j<arr.length; j++){
            sum+=arr[j];
        }
        if(sum%k!=0){
            return false;
        }
        func(arr,k,vis,0,sum/k);
        return true;
    }
    public static boolean func(int arr[], int k,int[] vis, int curr_Sum, int target){
        if(k==1){
            return true;
        }
        if(curr_Sum>target){
            return false;
        }
        if(curr_Sum==target){
            return func(arr,k-1,vis,0,target);
        }
        for(int i=0; i<arr.length; i++){
            if(vis[i]==0){
                vis[i]=1;
                if(func(arr,k,vis,curr_Sum+arr[i],target)){
                    return true;
                }
            }
        }
        return false;

    }

}
