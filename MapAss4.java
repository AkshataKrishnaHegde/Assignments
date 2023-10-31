package Map_And_Generics;

import java.util.Scanner;
import java.util.TreeMap;

public class MapAss4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();

        TreeMap<Integer,Integer> tm=new TreeMap<>();
        System.out.println("Enter the elements");
        for(int i=0; i<n;i++){
            int key=sc.nextInt();
            int val=i;
            tm.put(key,val);
        }
        System.out.println(tm.lastEntry().getKey());
    }

}
