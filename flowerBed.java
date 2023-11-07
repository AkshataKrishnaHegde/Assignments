package greedyAlgo;

public class flowerBed {
    public static void main(String[] args) {
        int flowerBed[]={1,0,0,0,1};
        int n=2;
        System.out.println(isPossible(flowerBed,n));

    }
    public static boolean isPossible(int f[],int n){
        int num=0;
        for(int i=0; i<f.length-2;i++){
            if(f[i]==0 && f[i+1]==0 && f[i+2]!=1){
                num++;
                f[i+1]=1;
            }
        }
        if(num>=n){
            return true;
        }
        else{
            return false;
        }
    }
}
//public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int count = 0;
//
//        for(int i = 0; i < flowerbed.length; i++){
//            if(flowerbed[i] == 0){
//                int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
//                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;
//
//                if(prev == 0 && next == 0){
//                    flowerbed[i] = 1;
//                    count++;
//                }
//            }
//        }
//        return count >= n;
//    }
