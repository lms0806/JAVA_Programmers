class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for(char c : rsp.toCharArray()){
            answer.append(c == '0' ? 5 : c == '2' ? 0 : 2);
        }
        return answer.toString();
    }
}
