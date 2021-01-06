class Solution {
    public int[] solution(long n) {
        String[] strs = Long.toString(n).split("");
        int[] answer = new int[strs.length];
        
        for(int i = 0; i < strs.length; i++){
            answer[strs.length-i-1] = Integer.parseInt(strs[i]); 
        }
        return answer;
    }
}
