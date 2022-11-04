import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static ArrayList<Integer>[] arr;
    public static int solution(int n, int[][] edge) {
        int answer = 0;
        
        arr = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < edge.length; i++) {
        	arr[edge[i][0]].add(edge[i][1]);
        	arr[edge[i][1]].add(edge[i][0]);
        }
        
        return bfs(n);
    }
    
    public static int bfs(int n) {
    	Queue<Integer> queue = new LinkedList<>();
    	int[] dist = new int[n + 1];

    	Arrays.fill(dist, -1);
    	
    	queue.add(1);
    	dist[1] = 0;
    	
    	int max = 0;
    	while(!queue.isEmpty()) {
    		int now = queue.poll();
    		
    		for(int next : arr[now]) {
    			if(dist[next] == -1) {
    				dist[next] = dist[now] + 1;
    				queue.add(next);
    				max = Math.max(dist[next], max);
    			}
    		}
    	}
    	
    	int answer = 0;
    	for(int d : dist) {
    		if(max == d) {
    			answer++;
    		}
    	}
    	return answer;
    }
}
