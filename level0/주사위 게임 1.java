class Solution {
    public int solution(int a, int b) {
        if(a % 2 == 1){
            return b % 2 == 1 ? a * a + b * b : 2 * (a + b);
        }
        return b % 2 == 1 ? 2 * (a + b) : Math.abs(a - b);
    }
}
