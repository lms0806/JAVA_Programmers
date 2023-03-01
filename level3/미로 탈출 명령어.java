import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        Queue<Node> queue = new LinkedList<>();
		boolean[][][] visited = new boolean[n + 1][m + 1][k + 1];
		
		visited[x][y][0] = true;
		queue.add(new Node(x, y, new StringBuilder()));
		
		int[] dx = {1, 0, 0, -1};
		int[] dy = {0, -1, 1, 0};
		char[] ds = {'d', 'l', 'r', 'u'};
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.x == r && now.y == c && now.road.length() == k) {
				return now.road.toString();
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx > 0 && nx <= n && ny > 0 && ny <= m) {
					if(now.road.length() + 1 <= k && !visited[nx][ny][now.road.length() + 1]) {
						visited[nx][ny][now.road.length() + 1] = true;
						queue.add(new Node(nx, ny, new StringBuilder(now.road).append(ds[i])));
					}
				}
			}
		}
		
        return "impossible";
    }
}

class Node {
	int x, y, cost;
	StringBuilder road;
	
	public Node(int x, int y, StringBuilder road) {
		this.x = x;
		this.y = y;
		this.road = road;
	}
}
