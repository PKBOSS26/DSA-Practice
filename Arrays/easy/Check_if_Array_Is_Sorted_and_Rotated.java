// title:- Check if Array Is Sorted and Rotated (leetcode)
// link:- https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
// difficulty:- easy
// Approach:
// 1) Identify Rotation Point: Traverse through the array and check where the order breaks (where an element is greater than the next element). This "break" happens exactly once in a valid rotated array.
// 2) Check if There’s More than One Break: If there's more than one such point where the order breaks, the array is neither sorted nor rotated properly.
// 3) Check if the Entire Array is Sorted: The elements before the break (if any) should be sorted, and the elements after the break should also be sorted.
// 4) Edge Case: If the array has only one element or no rotation (i.e., it’s sorted in a straightforward manner), the answer should be true.

// Time Complexity: O(n), where n is the number of elements in the array.
// Space Complexity: O(1), as we are using a constant amount of extra space.

public class Check_if_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2, 6, 7};
        System.out.println(check(nums));
    }
    
    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0; // To count the number of breaks

        // Edge case: A single element array is trivially sorted and rotated
        if (n == 1) return true;
    
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
    
        // If there is more than one break, the array is not sorted and rotated
        return count <= 1;
    }
}
