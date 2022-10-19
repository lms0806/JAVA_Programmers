class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        for(int i = -1000; i <= 1000; i++){
            int sum = 0;
            for(int j = i; j < i + num; j++){
                sum += j;
            }
            
            if(sum == total){
                int idx = 0;
                for(int j = i; j < i + num; j++){
                    answer[idx] = j;
                    idx++;
                }
                break;
            }
        }
        return answer;
    }
}
