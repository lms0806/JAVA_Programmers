class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(char ch : s.toCharArray()){
            if(ch != ' '){
                char c = (char)(ch + n);
                if(ch >= 'a' && ch <= 'z' && c > 'z'){
                    c -= 26;
                }
                else if(ch >= 'A' && ch <= 'Z' && c > 'Z'){
                    c -= 26;
                }
                answer += c;
            }
            else{
                answer += " ";
            }
        }
        return answer;
    }
}
