import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals_56 {
    public int[][] merge(int[][] intervals){
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));

        List<int[]> output_Arr = new ArrayList<>();
        int[] current_interval = intervals[0];
        output_Arr.add(current_interval);

        for (int[] interval: intervals) {
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            if(current_end >= next_begin) {
                current_interval[1] = Math.max(current_end,next_end);
            } else {
                current_interval = interval;
                output_Arr.add(current_interval);
            }
        }
        return output_Arr.toArray(new int[output_Arr.size()][]);
    }
}
