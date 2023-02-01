import java.util.Arrays;
import java.util.HashMap;

class Solution {
    static HashMap<Double, Integer> map = new HashMap<>();
	public static long solution(int[] weights) {
        long answer = 0;
        
        Arrays.sort(weights);
        
        for(int weight : weights) {
        	answer += solve(weight * 1.0);
        }
        
        return answer;
    }
	
	public static long solve(double weight) {
		long sum = map.containsKey(weight) ? map.get(weight) : 0;
		
		for(double i = 2.0; i <= 4.0; i++) {
			for(double j = 2.0; j <= 4.0; j++) {
				if(i == j) {
					continue;
				}
				
				if(map.containsKey((weight * i) / j))  {
					sum += map.get((weight * i) / j);
				}
			}
		}
		
		map.put(weight, map.getOrDefault(weight, 0) + 1);
		return sum;
	}
}
