// Title:- Largest element in array (gfg)
// Link:- https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array
// Difficulty:- easy
// Approach: - Linear

public class largest_element_in_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,65, 43 ,34, 57};        
        System.out.println(largest(arr));
    }

    public static int largest(int[] arr) {
        // code here
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}