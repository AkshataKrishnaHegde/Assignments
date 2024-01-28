package pp_practice_Qsn;
//<aside>
//💡  You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.
//
//</aside>
public class Array_Ass4 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int res[]=increment(arr);
        for (int x:res){
            System.out.print(x+" ");
        }

    }
    public static int[] increment(int arr[]){
        int n=arr.length;
        int res[]=new int[n];
        int temp=1;
        while (n-1>0){
            temp*=10;
            n--;
        }
        n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=arr[i]*temp+ans;
            temp=temp/10;
        }
        ans+=1;
        int j=n;
        while (ans>0){
            res[--j]=ans%10;
            ans=ans/10;

        }
        return res;
    }
}
