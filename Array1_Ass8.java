package pp_practice_Qsn;

public class Array1_Ass8 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5};
        int res[]=new int[2];
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                res[0]=arr[i];
                res[1]=arr[i+1]+1;
            }
        }
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
