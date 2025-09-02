//leetcode
//134. Gas Station

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;   // overall gas - cost
        int currTank = 0;    // gas left while traveling
        int start = 0;       // candidate starting index

        for (int i = 0; i < gas.length; i++) {
            totalTank += gas[i] - cost[i];
            currTank += gas[i] - cost[i];

            // If car cannot reach the next station
            if (currTank < 0) {
                start = i + 1;  // next station becomes candidate
                currTank = 0;   // reset current tank
            }
        }

        // If total gas is less than total cost, no solution
        return totalTank >= 0 ? start : -1;
    }
}
