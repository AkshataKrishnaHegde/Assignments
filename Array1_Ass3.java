package pp_practice_Qsn;
//<aside>
//💡 Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//</aside>
public class Array1_Ass3 {
    public static void main(String[] args) {
        int arr[]={3,6,5,1};
        int val=6;
        System.out.println(findIndex(arr,val));

    }
    public static int findIndex(int arr[],int val){
        int s=0;
        int end=arr.length-1;
        while (s<=end){
            int mid=(s+end)/2;
            if(arr[mid]==val){
                return mid;
            }
            else if(arr[mid]>val){
                end=mid-1;
            }
            else{
                s=mid+1; ;
            }
        }
        return end+1;
    }
}
