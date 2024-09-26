public class Container_With_Most_Water_11 {
    public int maxArea(int[] height) {
    int start_p = 0;
    int end_p = 0;
    int max = 0;

    while (start_p < end_p) {
        if (height[start_p] < height[end_p]){
            max = Math.max(max, height[start_p] * (end_p - start_p));
            start_p++;
        } else {
            max = Math.max(max, height[end_p] * (end_p - start_p));
            end_p--;
        }
    }
    return max;
    }
}
