import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] c = Long.toString(n).toCharArray();
        
        Arrays.sort(c);
        
        return Long.parseLong(new StringBuilder(new String(c)).reverse().toString());
    }
}
