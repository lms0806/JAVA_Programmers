class Solution {
    public int solution(int storey) {
        int answer = 0;
    	
    	String s = String.valueOf(storey);
    	
    	int overnum = 0;
    	for(int i = s.length() - 1; i >= 0; i--) {
    		int num = s.charAt(i) - '0' + overnum;
    		
            overnum = 0;
    		if(num > 5) {
    			answer += 10 - num;
    			overnum = 1;
    		}
    		else {
                if(num == 5 && i > 0 && s.charAt(i - 1) - '0' >= 5) {
    				overnum = 1;
    			}
    			answer += num;
    		}
    	}
        
        return overnum > 0 ? answer + 1 : answer;
    }
}
