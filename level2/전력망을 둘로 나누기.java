import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static ArrayList<Integer>[] arr;
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        arr = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++){
            arr[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < wires.length; i++){
            int a = wires[i][0], b = wires[i][1];
            
            arr[a].add(b);
            arr[b].add(a);
        }
        
        for(int i = 0; i < wires.length; i++){
            int a = wires[i][0], b = wires[i][1];
            
            arr[a].remove(arr[a].indexOf(b));
            arr[b].remove(arr[b].indexOf(a));
            
            answer = Math.min(answer, bfs(n, a));
            
            arr[a].add(b);
            arr[b].add(a);
        }
        return answer;
    }
    
    public static int bfs(int n, int start) {
    	Queue<Integer> queue = new LinkedList<>();
    	boolean[] visited = new boolean[n + 1];
        visited[start] = true;
    	queue.add(start);
    	
    	int count = 1;
    	while(!queue.isEmpty()) {
    		int now = queue.poll();
    		
    		for(int a : arr[now]) {
    			if(!visited[a]) {
    				visited[a] = true;
    				queue.add(a);
    				count++;
    			}
    		}
    	}
    	return Math.abs(count - (n - count));
    }
}
