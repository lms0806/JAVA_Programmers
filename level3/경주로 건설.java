import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, answer = Integer.MAX_VALUE;
	static boolean[][][] visited;
	public int solution(int[][] board) {
        n = board.length;
		
		visited = new boolean[n][n][4];
        
        bfs(board);
        
        return answer;
    }
	
	public static void bfs(int[][] board) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0, -1, 0}); // x, y, 이동, 금액
		//이동 : -1 - ? 0 - 우  1 - 아래  2 - 아래  3 - 위
		visited[0][0][0] = visited[0][0][1] = visited[0][0][2] = visited[0][0][3] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == n - 1 && now[1] == n - 1) {
				answer = Math.min(answer, now[3]);
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] != 1) {
					int dist = now[3];
                    
                    if(now[2] == i || now[2] == -1){
                        dist += 100;
                    }
                    else{
                        dist += 600;
                    }
					
					if(!visited[nx][ny][i] || board[nx][ny] >= dist) {
						board[nx][ny] = dist;
						queue.add(new int[] {nx, ny, i, dist});
						visited[nx][ny][i] = true;
					}
				}
			}
		}
	}
}
