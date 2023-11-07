package greedyAlgo;
//Q3. There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].You
//have a car with an unlimited gas tank ,and it costs, cost[i] of gas to travel from the ith station to its next (i +
//1)th station. You begin the journey with an empty tank at one of the gas stations.Given two integer arrays
//gas and cost, return the starting gas station s index if you can travel around the circuit once in the clockwise
//direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.
public class gasStation {
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        System.out.println(startingGasStation(gas,cost));


    }
    public static int startingGasStation(int gas[], int c[] ){
        int cost=0;
        int start=0;
        int sum=0;
        for(int i=0; i< gas.length;i++){
            sum+=(gas[i]-c[i]);
            cost+=gas[i]-c[i];
            if(cost<0){
                cost=0;
                start=i+1;
            }
        }
        if(sum>=0){
            return start% gas.length;
        }
        else{
            return -1;
        }

    }
}
