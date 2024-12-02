// Title:- Second Largest Element in Array (gfg)
// Link:- https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
// Difficulty:- easy
// Approach: - Linear

public class Second_Largest_Element_in_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,58, 43 ,34, 57};        
        System.out.println(getSecondLargest(arr));
        
    }

    public static int getSecondLargest(int[] arr) {
        // initialize max1 and max2
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, n = arr.length;

        //handle the case where the array has less then 2 elements
        if(n < 2){
            return -1;
        }

        // traverse the array and update max1 and max2 by comparing
        for(int i = 0; i < n; i++) {
            if(arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        // return max2 if it is not equal to Integer.MIN_VALUE otherwise return -1, 
        // the meaning of max2 being equal to Integer.MIN_VALUE is that there is only one element in the array
        return (max2 == Integer.MIN_VALUE) ? -1 : max2;
    }
}