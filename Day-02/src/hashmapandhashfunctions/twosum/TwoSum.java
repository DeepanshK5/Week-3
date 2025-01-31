package hashmapandhashfunctions.twosum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // The number we need to find in the map

            // If the complement is found in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);  // Output: Indices: 0, 1
        } else {
            System.out.println("No solution found.");
        }
    }
}
