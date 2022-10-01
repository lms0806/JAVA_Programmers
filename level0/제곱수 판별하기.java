class Solution {
    public int solution(int n) {
        double num = Math.sqrt(n);
        return num == (int)num ? 1 : 2;
    }
}
