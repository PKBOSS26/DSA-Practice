// title: - Remove Duplicates from Sorted Array (leetcode)
// link: - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// difficulty: - easy 
// Approach:- 
// 1) Use a two-pointer technique: One pointer (i) traverses the array, and Another pointer (k) keeps track of the position for the next unique element.
// 2) If nums[i] is not equal to the previous unique element (nums[k-1]), place it in the next unique position (nums[k]).
// Increment k for each unique element found.

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,2,3,3,4, 5, 6 ,6 ,8};
        System.out.println(new Remove_Duplicates_from_Sorted_Array().removeDuplicates(arr));

    }

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}