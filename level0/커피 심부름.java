class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String s : order){
            answer += s.equals("anything") | s.contains("americano") ? 4500 : 5000;
        }
        return answer;
    }
}
