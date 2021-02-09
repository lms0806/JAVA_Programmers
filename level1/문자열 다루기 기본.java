class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        String a = s.replaceAll("[^0-9]", "");
        if((s.length() == 4 || s.length() == 6) && a.length() == s.length()){
            answer = true;
        }
        return answer;
    }
}
