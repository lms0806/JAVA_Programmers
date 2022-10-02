class Solution {
    public int solution(String before, String after) {
        int[] alpha = new int[26];
        for(char c : before.toCharArray()){
            alpha[c - 'a']++;
        }
        
        for(char c : after.toCharArray()){
            alpha[c - 'a']--;
        }
        
        for(int i = 0; i < 26; i++){
            if(alpha[i] != 0){
                return 0;
            }
        }
        
        return 1;
    }
}
