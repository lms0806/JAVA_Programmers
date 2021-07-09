import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] split;

        for(int i = 0; i < commands.length; i++){
            int idx = 0;
            split = new int[commands[i][1] - commands[i][0] + 1];
            for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++){
                split[idx] = array[j];
                idx++;
            }
            Arrays.sort(split);
            answer[i] = split[commands[i][2]-1];
        }
        
        return answer;
    }
}
