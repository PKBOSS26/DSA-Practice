// Title:- Majority Element (leetcode)
// Link:- https://leetcode.com/problems/majority-element/
// Difficulty:- easy
// Approach:-
// Boyer-Moore Voting Algorithm
// The idea is to maintain a candidate and a count.
// If count is 0, we set the current number as the new candidate.
// If the current number matches the candidate, increment the count. Otherwise, decrement the count.
// By the end of the loop, the candidate is guaranteed to be the majority element.


public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,3,4,7,7,7,1,2,2};
        System.out.println(new Majority_Element().majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for(int num: nums){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1: -1;
        }
        return candidate;
    }
}