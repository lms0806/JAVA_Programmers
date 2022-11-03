import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    static ArrayList<Node>[] arr;
    public static int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        int[] answer = new int[2];
        
        arr = new ArrayList[n + 1];
        
        for(int i = 1; i <= n; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < paths.length; i++) {
        	int start = paths[i][0], end = paths[i][1];
        	int cost = paths[i][2];
        	
        	if(isgate(start, gates) || issummit(end, summits)) {
        		arr[start].add(new Node(end, cost));
        	}
        	else if(isgate(end, gates) || issummit(start, summits)) {
        		arr[end].add(new Node(start, cost));
        	}
        	else {
        		arr[start].add(new Node(end, cost));
        		arr[end].add(new Node(start, cost));
        	}
        }
        
        return dijkstra(n, gates, summits);
    }
    
    public static boolean isgate(int num, int[] gates) {
    	for(int gate : gates) {
    		if(num == gate) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean issummit(int num, int[] submits) {
    	for(int submit : submits) {
    		if(submit == num) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static int[] dijkstra(int n, int[] gates, int[] summits) {
    	PriorityQueue<Node> pq = new PriorityQueue<>();
    	int[] dist = new int[n + 1];
    	
    	Arrays.fill(dist, 1000000000);
    	
    	for(int gate : gates) {
    		pq.add(new Node(gate, 0));
    		dist[gate] = 0;
    	}
    	
    	while(!pq.isEmpty()) {
    		Node now = pq.poll();
            
            if(now.cost > dist[now.to]) {
    			continue;
    		}
    		
    		for(Node a : arr[now.to]) {
    			if(dist[a.to] > Math.max(dist[now.to], a.cost)) {
    				dist[a.to] = Math.max(dist[now.to], a.cost);
    				pq.add(new Node(a.to, dist[a.to]));
    			}
    		}
    	}
    	
    	int min = Integer.MAX_VALUE, num = 0;
    	
    	Arrays.sort(summits);
    	
    	for(int summit : summits) {
    		if(dist[summit] < min) {
    			min = dist[summit];
    			num = summit;
    		}
    	}
    	
    	return new int[] {num, min};
    }
}

class Node implements Comparable<Node>{
	int to, cost;
	
	public Node(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
