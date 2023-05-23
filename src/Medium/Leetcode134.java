package Medium;

//Referred pangdadi's comment: https://leetcode.com/problems/gas-station/editorial/comments/664193
class Leetcode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //two imp points, we can never start where gas-cost<0 and return -1 if totalgas-totalcost<0, start from the point before which we lost most of the gas.
        int min=Integer.MAX_VALUE;
        int minIndex=-1;
        int totalGas=0;
        for(int i=0;i<gas.length;i++){
            totalGas+=(gas[i]-cost[i]);
            if(totalGas<min){
                min=totalGas;
                minIndex=i;
            }
        }
        return totalGas<0?-1:(minIndex+1)%gas.length;
    }
}
