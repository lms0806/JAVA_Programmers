class Solution {
    public int solution(String[] strArr) {
        int[] num = new int[31];
        for(String s : strArr){
            num[s.length()]++;
        }
        
        int answer = 0;
        for(int n : num){
            answer = Math.max(answer, n);
        }
        return answer;
    }
}
