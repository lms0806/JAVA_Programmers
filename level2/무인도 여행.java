import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static char[][] board;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static int[] solution(String[] maps) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        board = new char[maps.length][];
        visited = new boolean[maps.length][maps[0].length()];
        
        for(int i = 0; i < maps.length; i++) {
        	board[i] = maps[i].toCharArray();
        }
        
        for(int i = 0; i < maps.length; i++) {
        	for(int j = 0; j < maps[i].length(); j++) {
        		if(!visited[i][j] && board[i][j] != 'X') {
        			arr.add(bfs(i, j));
        		}
        	}
        }
        
        if(arr.size() == 0) {
        	return new int[] {-1};
        }
        
        Collections.sort(arr);
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
        	answer[i] = arr.get(i);
        }
        return answer;
    }
	
	public static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		int sum = 0;
		while(!queue.isEmpty()) {
			int[] now= queue.poll();
			
			sum += board[now[0]][now[1]] - '0';
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length) {
					if(!visited[nx][ny] && board[nx][ny] != 'X') {
						queue.add(new int[] {nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		return sum;
	}
}
