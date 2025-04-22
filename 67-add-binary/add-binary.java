import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);

         while (!y.equals(BigInteger.ZERO)) {
            BigInteger carry = x.and(y);
            x = x.xor(y);
            y = carry.shiftLeft(1);
        }

        return x.toString(2);

        
    }
}