class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        for(int i = 0; i < 4; i++){
            int nx = h + dx[i];
            int ny = w + dy[i];
            
            if(nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny].equals(board[h][w])){
                answer++;  
            }
        }
        return answer;
    }
}
