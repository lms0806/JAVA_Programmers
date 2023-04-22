class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : myString.toLowerCase().toCharArray()){
            sb.append(c == 'a' ? "A" : c);
        }
        
        return sb.toString();
    }
}
