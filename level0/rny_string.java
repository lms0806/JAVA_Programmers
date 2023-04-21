class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();
        for(char c : rny_string.toCharArray()) {
        	sb.append(c == 'm' ? "rn" : c);
        }
        return sb.toString();
    }
}
