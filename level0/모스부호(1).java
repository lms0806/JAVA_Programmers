class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
    "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };
        
        String[] s = letter.split(" ");
               
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(s[i].equals(morse[j])){
                    answer.append((char)(j + 'a'));
                    break;
                }
            }
        }
        return answer.toString();
    }
}
