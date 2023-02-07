class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
        	int size = index;
        	
        	char c = s.charAt(i);
        	while(size != 0) {
        		c++;
        		
        		if(c > 'z') {
        			c = 'a';
        		}
        		
        		if(!skip.contains(c + "")) {
        			size--;
        		}
        	}
        	
        	sb.append(c);
        }
        
        return sb.toString();
    }
}
