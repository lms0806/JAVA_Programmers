class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        
        visited[0][0] = true;
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        int x = 0, y = 0;
        int idx = 0, num = 1;
        while(num != n * n + 1){
            answer[x][y] = num++;
            visited[x][y] = true;
            
            int nx = x + dx[idx], ny = y + dy[idx];
            
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]){
                x = nx;
                y = ny;
            }
            else{
                idx++;
                
                if(idx > 3) {
                	idx = 0;
                }
                
                x += dx[idx];
                y += dy[idx];
            }
        }
        return answer;
    }
}
