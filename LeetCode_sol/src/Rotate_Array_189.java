import java.util.Arrays;


public class Rotate_Array_189 {
    public void rotate (int[] arr,int k){
        k = k % arr.length;
        reverse(arr,0,arr.length);
        reverse(arr,0,k);
        reverse(arr,k,arr.length);
    }

    private void reverse(int[] arr,int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = arr[temp];
            start++;
            end--;
        }
    }
}
