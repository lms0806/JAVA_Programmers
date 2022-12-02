class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char x = s.charAt(0);
        int left = 0, right = 0;
        for(char c : s.toCharArray()) {
        	if(x == '1') {
        		x = c;
        	}
        	
        	if(x == c) {
        		left++;
        	}
        	else {
        		right++;
        	}
        	
        	if(left == right) {
        		left = 0;
        		right = 0;
        		answer++;
        		x = '1';
        	}
        }
        return answer + (x != '1' ? 1 : 0);
    }
}
