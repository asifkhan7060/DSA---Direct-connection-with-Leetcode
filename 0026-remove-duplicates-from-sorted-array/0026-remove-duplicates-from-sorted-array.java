class Solution {
    public int removeDuplicates(int[] nums) {

        int length = nums.length;
        int[] arr = new int[length];
        int inc = 0; // for arr traversal

        for (int i = 0; i < length; i++) {

            boolean found = false;

            for (int j = 0; j < inc; j++) {

                if (nums[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                arr[inc] = nums[i];
                inc++;
            }
        }

        // Copy back into nums because LeetCode checks nums
        for (int i = 0; i < inc; i++) {
            nums[i] = arr[i];
        }

        return inc;
    }
}