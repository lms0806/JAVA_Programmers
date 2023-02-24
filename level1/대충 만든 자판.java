class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++) {
        	int sum = 0;
        	for(char c : targets[i].toCharArray()) {
        		int min = Integer.MAX_VALUE;
        		for(int j = 0; j < keymap.length; j++) {
        			int which = keymap[j].indexOf(c + "") + 1;
        			
        			if(which != 0) {
        				min = Math.min(min, which);
        			}
        		}
        		
        		if(min == Integer.MAX_VALUE) {
        			sum = -1;
        			break;
        		}
        		sum += min;
        	}
        	
        	answer[i] = sum;
        }
        return answer;
    }
}
