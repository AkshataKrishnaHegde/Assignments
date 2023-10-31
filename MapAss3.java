package Map_And_Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapAss3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        Map m=new HashMap<>();
        boolean repeated=false;
        System.out.println("Enter elements");
        for(int i=0; i<n;i++){
            int val=sc.nextInt();
            if(m.containsValue(val)){
                repeated=true;
            }
            m.put(i,val);
        }
        if(repeated){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
