import java.util.HashSet;

class Solution {
    static int[] num;
	static boolean[] visited;
	static HashSet<Integer> set = new HashSet<>();
	public static int solution(String numbers) {
        int answer = 0;
        
        num = new int[numbers.length()];
        visited = new boolean[numbers.length()];
        for(int i = 0; i < num.length; i++) {
        	num[i] = numbers.charAt(i) - '0';
        }
        
        dfs(0, 0);
        
        for(int s : set) {
        	if(prime(s)) {
        		answer++;
        	}
        }
        
        return answer;
    }
	
	public static void dfs(int depth, int number) {
		set.add(number);
		
		if(depth == num.length) {
			return;
		}
		
		for(int i = 0; i < num.length; i++) {
			if(number == 0 && num[i] == 0) {
				continue;
			}
			if(!visited[i]) {
				visited[i] = true;
				dfs(depth + 1, number * 10 + num[i]);
				visited[i] = false;
			}
		}
	}
	
	public static boolean prime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
