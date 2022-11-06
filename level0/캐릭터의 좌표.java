class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(String key : keyinput){
            if(key.equals("left")){
                if(answer[0] > -board[0] / 2){
                    answer[0]--;
                }
            }
            else if(key.equals("right")){
                if(answer[0] < board[0] / 2){
                    answer[0]++;
                }
            }
            else if(key.equals("up")){
                if(answer[1] < board[1] / 2){
                    answer[1]++;
                }
            }
            else if(key.equals("down")){
                if(answer[1] > -board[1] / 2){
                    answer[1]--;
                }
            }
        }
        return answer;
    }
}
