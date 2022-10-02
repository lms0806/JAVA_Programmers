class Solution {
    public String solution(String my_string) {
        int[] alpha = new int[26], alpha2 = new int[26];
        
        int count = 0;
        StringBuilder answer = new StringBuilder();
        for(char c : my_string.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                alpha[c - 'a']++;
                
                if(alpha[c - 'a'] == 1){
                    answer.append(c);
                }
            }
            else if(c >= 'A' && c <= 'Z'){
                alpha2[c - 'A']++;
                
                if(alpha2[c - 'A'] == 1){
                    answer.append(c);
                }
            }
            else{
                count++;
                if(count == 1){
                    answer.append(c);
                }
            }
        }
        
        return answer.toString();
    }
}
