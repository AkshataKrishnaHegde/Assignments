package pp_practice_Qsn;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Array1_Ass6 {
    public static void main(String[] args) {
        int arr[]={4,5,7,7,8,9};
        System.out.println(containsDuplicate(arr));

    }
    public static boolean containsDuplicate(int arr[]){
        Map m=new HashMap<>();
        for(int i=0; i<arr.length;i++){
            if(m.containsKey(arr[i])){
                return true;
            }
            m.put(arr[i],1);
        }
        return false;
    }

}
