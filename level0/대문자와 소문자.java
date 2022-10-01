class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(char c : my_string.toCharArray()){
            answer.append(c >= 'a' && c <= 'z' ? (char)(c - 'a' + 'A') : (char)(c - 'A' + 'a'));
        }
        return answer.toString();
    }
}
