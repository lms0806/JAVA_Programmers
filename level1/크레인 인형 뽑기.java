class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] num = new int[moves.length];
        int count = 0;
        
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    num[count] = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    count++;
                    break;
                }
            }
            if(count > 1){
                if(num[count-1] == num[count-2]){
                    num[count-1] = 0;
                    num[count-2] = 0;
                    count-=2;
                    answer+=2;
                }
            }
        }
        
        return answer;
    }
}
