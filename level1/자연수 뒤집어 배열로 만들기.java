class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String[] strs = str.split("");
        int[] answer = new int[strs.length];
        
        for(int i = 0; i < strs.length; i++){
            answer[strs.length-i-1] = Integer.parseInt(strs[i]); 
        }
        return answer;
    }
}
