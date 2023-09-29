package BackTracking;

public class Ass4 {
    public static void main(String[] args) {
        int arr[]={8,7,5};
        System.out.println((func(arr,0,5,1)? "Yes" :"No"));

    }
    public static boolean func(int arr[],int i,int target, int product){
        if(i==arr.length){
            return (product==target);
        }
        boolean ans=false;
        product*=arr[i];
        ans |=func(arr,i+1,target,product);
        product/=arr[i];
       ans|= func(arr,i+1,target,product);

        return ans;

    }
}
