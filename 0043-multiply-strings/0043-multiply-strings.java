import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {

        // int value1 = Integer.parseInt(num1);
        // int value2 = Integer.parseInt(num2);

        // int sum = value1 * value2;

        // String result = String.valueOf(sum);

        // return result;

        BigInteger value1 = new BigInteger(num1);
        BigInteger value2 = new BigInteger(num2);

        BigInteger product = value1.multiply(value2);

        return product.toString();
        
    }
}