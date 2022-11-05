import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = BigInteger.ONE;
        
        for(int i = 1; i <= share; i++){
        	answer = answer.multiply(BigInteger.valueOf(balls - i + 1));
        	answer = answer.divide(BigInteger.valueOf(i));
        }
        return answer.intValue();
    }
}
