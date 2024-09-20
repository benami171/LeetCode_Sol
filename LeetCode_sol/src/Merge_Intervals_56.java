import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals_56 {
    public int[][] merge(int[][] intervals){
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals,(arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        List<int[]> output_Arr = new ArrayList<>();

    }
}
