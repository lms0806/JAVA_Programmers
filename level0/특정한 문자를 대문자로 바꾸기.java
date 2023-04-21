class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append(c == alp.charAt(0) ? (char)(c - 'a' + 'A') : c);
        }
        return sb.toString();
    }
}
