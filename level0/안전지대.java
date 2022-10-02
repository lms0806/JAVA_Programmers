class Solution {
    public int solution(int[][] board) {
        int answer = board.length * board[0].length;
        
        int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
        int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
        
        boolean[][] check = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    check[i][j] = true;
                    for(int k = 0; k < 8; k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        
                        if(nx >= 0 && nx < board.length && ny >= 0 && ny < board[i].length){
                            check[nx][ny] = true;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < check.length; i++){
            for(int j = 0; j < check[i].length; j++){
                if(check[i][j]){
                    answer--;
                }
            }
        }
        return answer;
    }
}
