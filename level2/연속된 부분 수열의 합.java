class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[] {0, sequence.length - 1};
        
        int s = 0, e = 1;
        int sum = sequence[0];
        
        while(s < e){
            if(sum == k){
                if(e - s - 1 < answer[1] - answer[0]){
                    answer[0] = s;
                    answer[1] = e - 1;
                }
                sum -= sequence[s++];
            }
            else if(sum > k){
                sum -= sequence[s++];
            }
            else if(e < sequence.length){
                sum += sequence[e++];
            }
            else{
                break;
            }
        }
        return answer;
    }
}
