import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> truck = new LinkedList<>();

		for(int i = 0; i < truck_weights.length; i++){
			truck.add(truck_weights[i]);
		}
		
		int answer = 0;
		Deque<Node> bridge = new ArrayDeque<>();
		while(!truck.isEmpty() || !bridge.isEmpty()) {
			int sum = 0;
			int len = bridge.size();
			for(int i = 0; i < len; i++) {
				Node now = bridge.pollFirst();
				
				if(now.time == 1) {
					continue;
				}
				
				bridge.add(new Node(now.w, now.time - 1));
				sum += now.w;
			}
			
			if(!truck.isEmpty() && truck.peek() + sum <= weight && bridge.size() < bridge_length) {
				bridge.add(new Node(truck.poll(), bridge_length));
			}
			
			answer++;
		}
		return answer;
	}
}

class Node{
	int w, time;
	
	public Node(int w, int time) {
		this.w = w;
		this.time = time;
	}
}
