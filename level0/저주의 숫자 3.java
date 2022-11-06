class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        while(true){
            answer++;
            if(answer % 3 == 0 || String.valueOf(answer).contains("3")){
                continue;
            }
            else{
                count++;
            }
            
            if(count == n){
                break;
            }
        }
        return answer;
    }
}
