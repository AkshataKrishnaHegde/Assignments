package pp_practice_Qsn;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
public class Array1_Ass1 {
    public static void main(String[] args) {


        int arr[] = {5, 3, 7, 8};
        int target = 8;
        int res[]=calc(arr,target);
        System.out.println(res[0]+" " +res[1]);
    }
    public static int[] calc(int arr[],int target){
        int sol[]=new int[2];
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0; i<arr.length;i++){
            int checkNum=target-arr[i];
            if(m.containsValue(checkNum)){
                sol[0]=checkNum;
                sol[1]=arr[i];
            }
            else{
                m.put(i,arr[i]);
            }
        }
        return sol;

    }
}

