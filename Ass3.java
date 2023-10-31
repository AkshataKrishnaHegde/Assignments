package DivideAndConquer;

public class Ass3 {
    public static void main(String[] args) {
        int[] num={19,-20,7,-4,-13,11,-5,3};
        int n= num.length;
        int[] temp=new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = num[i];
        }
        partition(num,temp,0,n-1);
        for (int i=0; i<n; i++){
            System.out.print(num[i] + " ");
        }

        
    }
    public static void partition(int[] arr,int[] temp, int l,int h ){
        if(h<=l){
            return;
        }
        int mid=(l+((h-l)>>1));
        partition(arr,temp,l,mid);
        partition(arr,temp,mid+1,h);

        merge(arr,temp,l,h,mid);

    }
    public static void merge(int[] arr, int[] temp, int l ,int h, int mid){
        int k=l;
        for(int i=l; i<=mid; i++){
            if(arr[i]<0){
                temp[k++]=arr[i];
            }
        }
        for (int i=mid+1; i<=h; i++){
            if(arr[i]<0){
                temp[k++]=arr[i];
            }
        }
        for(int i=l; i<=mid; i++){
            if(arr[i]>=0){
                temp[k++]=arr[i];
            }
        }
        for (int i=mid+1; i<=h; i++){
            if(arr[i]>=0){
                temp[k++]=arr[i];
            }
        }
        for (int i=l; i<=h;i++){
            arr[i]=temp[i];
        }
    }

}
