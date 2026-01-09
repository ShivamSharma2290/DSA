
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n =new BigInteger(num1);
        BigInteger k =new BigInteger(num2);

        BigInteger l=n.multiply(k);
        return l.toString();
    }
}