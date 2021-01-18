import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] result = new double[N];
        
        Arrays.sort(stages);
        
        int stagelevel = 1;
        for(int i = 0; i < N; i++){
            int clear = 0, trys = 0;
            for(int j = 0; j < stages.length; j++){
                if(stages[j] != 0){
                    trys++;
                }
                if(stages[j] == stagelevel){
                    clear++;
                    stages[j] = 0;
                }
            }
            if(clear == 0){
                result[i] = 0;
            }
            else{
                result[i] = (double)clear/(double)trys;
            }
            stagelevel++;
        }
        
        for(int i = 0; i < result.length; i++){
            double min = 0;
            int count = 0;
            for(int j = 0; j < result.length; j++){
                if(min < result[j]){
                    min = result[j];
                    count = j+1;
                } 
            }
            if(count != 0){
                answer[i] = count;
                result[count-1] = -1;  
            }
        }
        
        for(int i = 0; i < result.length; i++){
            if(result[i] != -1){
                for(int j = 0; j < answer.length; j++){
                    if(answer[j] == 0){
                        answer[j] = i+1;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
