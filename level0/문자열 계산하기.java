class Solution {
    public int solution(String my_string) {
        String[] s = my_string.split(" ");
        
        int answer = Integer.parseInt(s[0]);
        
        for(int i = 1; i < s.length; i += 2){
            int num = Integer.parseInt(s[i + 1]);
            
            answer += s[i].equals("+") ? num : -num;
        }
        return answer;
    }
}
