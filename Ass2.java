package BackTracking;
//Q2. Given an integer array arr, print all the possible permutations of
//
//the given array.
import java.util.ArrayList;
import java.util.List;

public class Ass2 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        permute(res,arr,temp);
        System.out.println(res);


    }
    public static void permute(List<List<Integer>> res, int[] arr, List<Integer> temp){
        if(arr.length==temp.size()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<arr.length;i++){
            if(temp.contains(arr[i])){
                continue;
            }
            temp.add(arr[i]);
            permute(res,arr,temp);
            temp.remove(temp.size()-1);
        }

    }
}
