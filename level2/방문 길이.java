class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        boolean[][][][] visited = new boolean[11][11][11][11];
        
        int x = 5, y = 5;
        
        int idx = 0;
        for(char c : dirs.toCharArray()){
            int nx = x, ny = y;
            if(c == 'R'){
                idx = 0;
            }
            else if(c == 'D'){
                idx = 1;
            }
            else if(c == 'L'){
                idx = 2;
            }
            else {
                idx = 3;
            }
            
            x += dx[idx];
            y += dy[idx];
            
            if(x >= 0 && x < 11 && y >= 0 && y < 11){
                if(!visited[x][y][nx][ny] && !visited[nx][ny][x][y]){
                    visited[x][y][nx][ny] = visited[nx][ny][x][y] = true;
                    answer++;
                }
            }
            else{
                x -= dx[idx];
                y -= dy[idx];
            }
        }
        return answer;
    }
}
