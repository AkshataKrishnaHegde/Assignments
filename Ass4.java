package DivideAndConquer;

import java.util.Arrays;
import java.util.Collections;

//Q4. Given two arrays of equal size n and an integer k. The task is to permute both arrays such that
  //      the sum of their corresponding element is greater than or equal to k i.e a[i] + b[i] >= k. The task is
    //    to print “Yes” if any such permutation exists, otherwise print “No”.
public class Ass4 {
    public static void main(String[] args) {
        int a[]={2,1,3};
        Integer b[]={7, 8, 9};
        int k=10;
        if(isPos(a,b,k)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }


    }
    public static boolean isPos(int a[], Integer b[],int k){
        Arrays.sort(b, Collections.reverseOrder());
        Arrays.sort(a);
        int n=b.length;
        for (int i=0; i<n; i++){
            if(a[i]+b[i]<k){
                return false;
            }
        }
        return true;

    }

}
