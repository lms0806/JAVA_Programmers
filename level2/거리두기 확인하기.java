import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	public static int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for(int i = 0; i < places.length; i++) {
        	answer[i] = solve(places[i]);
        }
        return answer;
    }
	
	public static int solve(String[] p) {
    	for(int j = 0; j < 5; j++) {
    		for(int k = 0; k < 5; k++) {
    			if(p[j].charAt(k) == 'P') {
    				if(!bfs(j, k, p)) {
    					return 0;
    				}
    			}
    		}
    	}
    	return 1;
	}
	
	public static boolean bfs(int x, int y, String[] p) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[5][5];
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5 && !visited[nx][ny]) {
					int d = Math.abs(nx - x) + Math.abs(ny - y);
					
                    if(d <= 2){
                        if(p[nx].charAt(ny) == 'P'){
                            return false;
                        }
                        else if(p[nx].charAt(ny) == 'O'){
                            queue.add(new int[] {nx, ny});
                        }
                        visited[nx][ny] = true;
                    }
				}
			}
		}
		return true;
	}
}
