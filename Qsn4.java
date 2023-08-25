package RecursionAssignment;

public class Qsn4 {
    public static void main(String[] args) {
        int arr[]={92,23,15,-20,10};
        int n=arr.length;
        int sum=sum(arr,0,n);
        System.out.println("The sum is:"+sum);
    }
    public static int sum(int arr[], int idx,int n){
        if(idx==n-1){
            return arr[idx];
        }
        return arr[idx]+sum(arr,idx+1,n);
    }
}
