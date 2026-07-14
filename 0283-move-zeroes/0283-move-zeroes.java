class Solution {
    public void moveZeroes(int[] nums) {

        // My logic - code runs but time exceed problem :
        
        // int store = 0;

        // for (int i = 0; i < nums.length; i++) {

        //     if (nums[i] == 0) {

        //         for (int j = i; j < nums.length - 1; j++) {
        //             nums[j] = nums[j + 1];
        //         }

        //         store = nums.length - 1;
        //         nums[store] = 0;
        //     }
        // }

        int store = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[store] = nums[i];
                store++;
            }
        }

        while (store < nums.length) {
            nums[store] = 0;
            store++;
        }
    }
}
