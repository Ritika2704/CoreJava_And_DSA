package arrayPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static int [][] insert(int [][] intervals, int [] newInterval){
        List<int[]> result = new ArrayList<>();

        // Iterate through intervals and add non-overlapping intervals before newInterval
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        // Add merged newInterval
        result.add(newInterval);

        // Add non-overlapping intervals after newInterval
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);

    }
    public static void main(String[] args) {
     int Intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
     int interval [] = {4,11};

        System.out.println(Arrays.deepToString(insert(Intervals, interval)));
    }
}
