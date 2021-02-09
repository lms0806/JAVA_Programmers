class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(s.length() != 1){
            String str = "";
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(ch == '1'){
                    str += ch;
                }
            }
            answer[0]++;
            answer[1] += s.length() - str.length();
            s = Integer.toBinaryString(str.length());
        }
        
        return answer;
    }
}
