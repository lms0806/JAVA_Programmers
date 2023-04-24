class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : myString.toCharArray()){
            sb.append(c <= 'l' ? 'l' : c);
        }
        
        return sb.toString();
    }
}
