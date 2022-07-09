class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] map = new char[m][n];
        
        for(int i = 0; i < board.length; i++){
            map[i] = board[i].toCharArray();
        }
        
        while(true){
            int count = checkblock(m, n, map);
            if(count == 0){
                break;
            }
            
            answer += count;
            
            for(int y = 0; y < n; y++){
                for(int x = m - 1; x >= 0; x--){
                    if(map[x][y] == '.'){
                        for(int nx = x - 1; nx >= 0; nx--){
                            if(map[nx][y] != '.'){
                                map[x][y] = map[nx][y];
                                map[nx][y] = '.';
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        return answer;
    }
    
    public static int checkblock(int m, int n, char[][] map){
        int count = 0;
        boolean[][] check = new boolean[m][n];
        
        for(int i = 0; i < m - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(map[i][j] != '.'){
                    checkfour(map, check, i, j);
                }
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(check[i][j]){
                    count++;
                    map[i][j] = '.';
                }
            }
        }
        
        return count;
    }
    
    public static void checkfour(char[][] map, boolean[][] check, int x, int y){
        for(int i = x; i < x + 2; i++){
            for(int j = y; j < y + 2; j++){
                if(map[i][j] != map[x][y]){
                    return;
                }
            }
        }
        
        for(int i = x; i < x + 2; i++){
            for(int j = y; j < y + 2; j++){
                check[i][j] = true;
            }
        }
    }
}
