package Map_And_Generics;

import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeMap;

public class MapAss2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        TreeMap<String,Integer> tm=new TreeMap<>();
        System.out.println("Enter the elements");
        for (int i=0; i<n;i++){
            int value=sc.nextInt();
            String key=sc.next();
            tm.put(key,value);
        }
        System.out.println(tm);
    }
}
