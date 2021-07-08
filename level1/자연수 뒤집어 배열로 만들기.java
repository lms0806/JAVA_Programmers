class Solution {
    public int[] solution(long n) {
        String[] strs = new StringBuilder(Long.toString(n)).reverse().toString().split("");
        int[] answer = new int[strs.length];
        
        for(int i = 0; i < strs.length; i++){
            answer[i] = Integer.parseInt(strs[i]);
        }
        return answer;
    }
}
