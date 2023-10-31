package Map_And_Generics;

import java.util.Scanner;
import java.util.TreeMap;

public class MapAss1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        TreeMap<Integer,String> tm=new TreeMap<>();
        System.out.println("Enter the elements in key and value");
        for(int i=0; i<n;i++){
            int key=sc.nextInt();
            String value=sc.next();
            tm.put(key,value);
        }
        System.out.println(tm);
    }
}
