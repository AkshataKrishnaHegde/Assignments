package BackTracking;
//Q3. Given a collection of numbers, nums, that might contain
//
//duplicates, return all possible
//
//unique permutations in any order.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ass3 {
    public static void main(String[] args) {
        int arr[]={1,1,3};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean used[]=new boolean[arr.length];
        Arrays.sort(arr);
        permute(res,used,arr,temp);
        System.out.println(res);


    }
    public static void permute(List<List<Integer>> res,boolean[] used, int[] arr, List<Integer> temp){
        if(arr.length==temp.size()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<arr.length;i++){
            if(used[i]){
                continue;
            }
            if(i>0 && arr[i-1]==arr[i] && !used[i-1]){
                continue;
            }
            used[i]=true;
            temp.add(arr[i]);
            permute(res,used,arr,temp);
            used[i]=false;
            temp.remove(temp.size()-1);
        }

    }
}

