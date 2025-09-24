import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(String[] str) {
        char[][] board = new char[str.length][str[0].length()];
        
        int sx = 0, sy = 0, ex = 0, ey = 0;
        for(int i = 0; i < str.length; i++) {
            board[i] = str[i].toCharArray();
            
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'R'){
                    sx = i;
                    sy = j;
                }
                else if(board[i][j] == 'G'){
                    ex = i;
                    ey = j;
                }
            }
        }
        
        return bfs(board, sx, sy, ex, ey);
    }
    
    public static int bfs(char[][] board, int sx, int sy, int ex, int ey){
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        queue.add(new int[] {sx, sy, 0});
        visited[sx][sy] = true;
        
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            
            if(now[0] == ex && now[1] == ey){
                return now[2];
            }
            
            for(int i = 0; i < 4; i++){
                int nx = now[0], ny = now[1];
                while(true){
                    if(nx < 0 || nx >= board.length || ny < 0 || ny >= board[0].length || board[nx][ny] == 'D'){
                        nx -= dx[i];
                        ny -= dy[i];
                        break;
                    }
                    
                    nx += dx[i];
                    ny += dy[i];
                }
                
                if(!visited[nx][ny]){
                    visited[nx][ny] = true;
                    queue.add(new int[] {nx, ny, now[2] + 1});
                }
            }
        }
        return -1;
    }
}
