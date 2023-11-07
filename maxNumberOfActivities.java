package greedyAlgo;
//You are given n activities with their start and finish times. Select the maximum number of activities that
//can be performed by a single person, assuming that a person can only work on a single activity at a time.
public class maxNumberOfActivities {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int finish[] = { 3, 5, 6, 8, 9, 9 };
        int n = start.length;
        maxActivities(start,finish,n);
    }
    public static void maxActivities(int s[], int f[], int n){
        int i;
        System.out.println("The selected activities are: ");
        i=0;
        System.out.print(i+" ");
        for (int j=1; j<n;j++){
            if(s[j]>=f[i]){
                System.out.print(j+" ");
                i=j;
            }
        }
    }
}
