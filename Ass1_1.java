package DivideAndConquer;
//Q1. Given an integer array, find the kth larger element using the quick select algorithm.
//input 1 : arr[] = {1,3,2,4,5,6,7} , k = 3
//output 1 : 5
//input 2: arr[] = {4,3,3,2,1} , k = 4
//output 2: 2
public class Ass1_1 {
    public static void main(String[] args) {
        int arr[]={4,3,3,2,1};
        int k=1;
        System.out.println(selectionProcedure(arr,k,0,arr.length-1));


    }
    public static int selectionProcedure(int[] arr,int k,int l, int h){
        int n=arr.length;
        int m=partition(arr,k,l,h);
        if(m==n-k){
            return arr[m];
        }
        else if(m>n-k){
            return selectionProcedure(arr,k,l,m-1);
        }
        else{
            return selectionProcedure(arr,k,m+1,h);
        }
    }
    public static int partition(int[] arr,int k,int l,int h){
     int n=arr.length;
     int pivot=arr[l];
     int i=l;
     for(int j=i+1; j<=h;j++){
         if(arr[j]<=pivot){
             ++i;
             int tem=arr[i];
             arr[i]=arr[j];
             arr[j]=tem;
         }
     }
     int temp=arr[i];
     arr[i]=arr[l];
     arr[l]=temp;

     return i;

    }
}
