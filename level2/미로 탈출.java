import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static char[][] board;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static int solution(String[] maps) {
        int answer = 0;
        
        board = new char[maps.length][];
        
        int ex = 0, ey = 0;
        int sx = 0, sy = 0;
        int lx = 0, ly = 0;
        for(int i = 0; i < maps.length; i++) {
        	board[i] = maps[i].toCharArray();
        	
        	for(int j = 0; j < board[i].length; j++) {
        		if(board[i][j] == 'S') {
        			sx = i;
        			sy = j;
        		}
        		else if(board[i][j] == 'L') {
        			lx = i;
        			ly = j;
        		}
        		else if(board[i][j] == 'E') {
        			ex = i;
        			ey = j;
        		}
        	}
        }
        
        int a = bfs(sx, sy, lx, ly), b = bfs(lx, ly, ex, ey);
        
        if(a == -1 || b == -1) {
        	return -1;
        }
        
        return a + b;
    }
	
	public static int bfs(int startx, int starty, int endx, int endy) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[board.length][board[0].length];
		
		queue.add(new int[] {startx, starty, 0});
		visited[startx][starty] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[0] == endx && now[1] == endy) {
				return now[2];
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length) {
					if(!visited[nx][ny] && board[nx][ny] != 'X') {
						visited[nx][ny] = true;
						queue.add(new int[] {nx, ny, now[2] + 1});
					}
				}
			}
		}
		
		return -1;
	}
}
