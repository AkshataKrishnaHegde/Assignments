package DivideAndConquer;

public class Ass5 {
    static class Interval {
        int start;
        int end;
        public Interval(int start, int end) {
            super();
            this.start = start;
            this.end = end;
        }
    };
    public static void main(String[] args) {
        Interval arr[]={new Interval(1,3),new Interval(7,9),new Interval(4,6),new Interval(10,13)};
        int n=arr.length;
        if(isIntersect(arr,n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }


    }
    public static boolean isIntersect(Interval arr[],int n){
        int maxEle=0;
        for (int i=0; i<n;i++){
            if(arr[i].end>maxEle){
                maxEle=arr[i].end;
            }
        }
        int[] array=new int[maxEle+1];
        for(int i=0; i<n;i++){
            int x=arr[i].start;
            int y=arr[i].end;
            array[x]++;
            array[y]--;
        }
        for(int i=1; i<=maxEle;i++){
            array[i]=array[i-1];
            if(array[i]>1){
                return true;
            }
        }
        return false;
    }
    
}
