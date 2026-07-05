class Solution {
    public int digitFrequencyScore(int n) {

        int sum = 0;
        int x = 0;
        // 123

        while(n != 0){

            x = n % 10;
            sum = sum + x;
            n = n/10;
        }

        return sum;
        
    }
}