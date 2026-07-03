class Solution {
    public int reverse(int x) {

        int reminder = 0;
        int reverse = 0;

        while (x != 0) {

            reminder = x % 10;

            // Check for overflow before updating reverse
            if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && reminder > 7)) {
                return 0;
            }

            if (reverse < Integer.MIN_VALUE / 10 ||
                (reverse == Integer.MIN_VALUE / 10 && reminder < -8)) {
                return 0;
            }

            reverse = reverse * 10 + reminder;
            x = x / 10;
        }

        return reverse;
    }
}