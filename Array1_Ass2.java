package pp_practice_Qsn;
//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
// The order of the elements may be changed. Then
// return the number of elements in nums which are not equal to val.
public class Array1_Ass2 {
    public static void main(String[] args) {
        int arr[]={3,5,4,3,2,1,2};
        int val=2;
        removeEle(arr,val);

    }
    public static void removeEle(int[] arr,int val){
        int[] res=new int[arr.length];
        int k=0;
        for(int x:arr){
            if(x!=val){
                res[k++]=x;
            }
        }
        for(int i=0; i<k;i++){
            System.out.print(res[i]+" ");
        }

    }
}
