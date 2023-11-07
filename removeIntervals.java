package greedyAlgo;
//Q5. Given an array of intervals where intervals[i] = [start i, end i], return the minimum number of intervals
//you need to remove to make the rest of the intervals non-overlapping.
import java.sql.Array;
import java.util.Arrays;

public class removeIntervals {
    public static void main(String[] args) {
        int interval[][]={{1,2},{2,3},{3,4},{1,3}};
        System.out.println(removeOverlappingIntervals(interval));

    }
    public static int removeOverlappingIntervals(int [][]intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
      int[] curr=new int[] {intervals[0][0],intervals[0][1]};
      int max=1;
      for(int i=0; i<intervals.length;i++){
          if(intervals[i][0]<curr[1]){
              continue;
          }
          else{
              curr[0]=intervals[i][0];
              curr[1]=intervals[i][1];
              max++;
          }
      }
      int res=intervals.length-max;
      return res;
    }
}
