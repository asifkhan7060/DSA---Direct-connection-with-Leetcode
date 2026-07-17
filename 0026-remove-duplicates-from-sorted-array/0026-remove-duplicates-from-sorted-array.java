class Solution {
    public int removeDuplicates(int[] nums) {

        // 4-5ms code

        // int length = nums.length;
        // int[] arr = new int[length];
        // int inc = 0; // for arr traversal

        // for (int i = 0; i < length; i++) {

        //     boolean found = false;

        //     for (int j = 0; j < inc; j++) {

        //         if (nums[i] == arr[j]) {
        //             found = true;
        //             break;
        //         }
        //     }

        //     if (!found) {
        //         arr[inc] = nums[i];
        //         inc++;
        //     }
        // }

        // // Copy back into nums because LeetCode checks nums
        // for (int i = 0; i < inc; i++) {
        //     nums[i] = arr[i];
        // }

        // return inc;



        // 1ms code

        int k=1;

        for(int i=1;i<nums.length;i++){

        if(nums[i]!=nums[k-1]){

            nums[k]=nums[i];
            k++;
        }
      }

        return k;

        // input nums : [0,1,2,3,4,2,2,3,3,4]
        // k = 5
        // Output nums : [0,1,2,3,4,2,2,3,3,4] LeetCode only checks the first k elements (note)
    }
}