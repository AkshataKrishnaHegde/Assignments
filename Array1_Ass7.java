package pp_practice_Qsn;
//<aside>
//💡  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//</aside>
public class Array1_Ass7 {
    public static void main(String[] args) {
        int arr[]={3,0,0,7,3,0,4};
        move(arr);


    }
    public static void move(int arr[]){
        int res[]=new int[arr.length];
        int j=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                res[j++]=arr[i];
            }
        }
        while (j<arr.length){
            res[j++]=0;
        }
        for (int x:res){
            System.out.print(x+" ");
        }

    }

}
