package greedyAlgo;

import java.lang.reflect.Array;

//Q1. Find the minimum sum of Products of two arrays of the same size, given that k modifications are allowed
//on the first array. In each modification, one array element of the first array can either be increased or
//decreased by 2.
public class minSumOfProducts {
    public static void main(String[] args) {
        int a[]={1,2,-3};
        int b[]={-2,3,-5};
        int k=5;
        System.out.println(minSum(k,a,b));
    }
    public static int minSum(int k, int a[], int b[]){
        int res=0, diff=0, product=0, tempAns=0;
        for(int i=0; i<a.length;i++){
            product=a[i]*b[i];
            res+=product;
            if(product<0 && a[i]<0){
                tempAns=(a[i]-2*k)*b[i];
            } else if (product<0 && a[i]>0) {
                tempAns=(a[i]+2*k)*b[i];
            } else if (product>0 && a[i]>0) {
                tempAns=(a[i]-2*k)*b[i];
            }
            else{
                tempAns=(a[i]+2*k)*b[i];
            }
            int d=Math.abs(product-tempAns);
            if(d>diff){
                diff=d;
            }
        }
        return res-diff;
    }
}
