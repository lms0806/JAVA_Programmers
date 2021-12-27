import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static boolean[][] visited;
	public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        
        visited = new boolean[m][n];
        
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		if(!visited[i][j] && picture[i][j] != 0) {
        			answer[0]++;
        			answer[1] = Math.max(answer[1], bfs(m, n, i, j, picture[i][j], picture));
        		}
        	}
        }
        
        return answer;
    }
	
	public static int bfs(int m, int n, int x, int y, int num, int[][] picutre) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		int count = 1;
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < m && ny >= 0 && ny < n) {
					if(!visited[nx][ny] && picutre[nx][ny] == num) {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
						count++;
					}
				}
			}
		}
		return count;
	}
}
