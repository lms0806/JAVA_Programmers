import java.util.HashSet;

class Solution {
    public int solution(int[][] dots) {
        HashSet<Double> set = new HashSet<>();
        
        for(int i = 0; i < dots.length; i++) {
        	for(int j = i + 1; j < dots.length; j++) {
        		double n = (double)((dots[i][1] - dots[j][1])) / (double)((dots[i][0] - dots[j][0]));
                
        		if(set.contains(n)) {
        			return 1;
        		}
        		
        		set.add(n);
        	}
        }
        return 0;
    }
}
