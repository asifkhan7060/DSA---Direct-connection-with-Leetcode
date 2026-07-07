class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;

        // Starting index
        for (int i = 0; i < arr.length; i++) {

            // Ending index
            for (int j = i; j < arr.length; j++) {

                // Length of current subarray
                int length = j - i + 1;

                // Check if length is odd
                if (length % 2 != 0) {

                    // Find sum of current subarray
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }
                }
            }
        }

        return sum;
    }
}