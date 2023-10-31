package Map_And_Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapAss5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the RansomNote String");
        String s1=sc.nextLine();
        System.out.println("Enter the Magazine String");
        String s2=sc.nextLine();
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0; i< s1.length();i++){
            if(hm1.containsKey(s1.charAt(i))){
                hm1.put(s1.charAt(i),hm1.get(s1.charAt(i))+1);
            }
            else{
                hm1.put(s1.charAt(i),1);
            }
        }
        HashMap<Character,Integer> hm2=new HashMap<>();
        for (int i=0; i<s2.length();i++){
            if(hm2.containsKey(s2.charAt(i))){
                hm2.put(s2.charAt(i),hm2.get(s2.charAt(i))+1);
            }
            else{
                hm2.put(s2.charAt(i),1);
            }
        }
        Integer ans=-1;
        for(Map.Entry<Character,Integer> n:hm1.entrySet()){
            if(n.getValue()>hm2.get(n.getKey())){
                System.out.println("False");
                ans=1;
                break;
            }
        }
        if(ans==-1){
            System.out.println("True");
        }

    }
}
