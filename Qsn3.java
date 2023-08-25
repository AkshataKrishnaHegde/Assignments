package RecursionAssignment;

public class Qsn3 {
    public static void main(String[] args) {
        int arr[]={13,1,-3,22,5};

        int max=maxVal(arr,arr.length,0);
        System.out.println(max);
    }
    public static int maxVal(int arr[],int n,int idx){
        if(idx==n-1){
            return arr[n-1];
        }
        else{
            int max=maxVal(arr,n,idx+1);
            int maxValue=Math.max(arr[idx],max);
            return maxValue;
        }

    }
}
