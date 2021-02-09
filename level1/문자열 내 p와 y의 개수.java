class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0, count1 = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'P' || s.charAt(i) == 'p'){
                count++;
            }
            if(s.charAt(i) == 'Y' || s.charAt(i) == 'y'){
                count1++;
            }
        }
        
        if(count != count1){
            answer = false;
        }

        return answer;
    }
}
