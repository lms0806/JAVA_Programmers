class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(true){
            if(chicken / 10 == 0){
                break;
            }
            
            answer += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }
        return answer;
    }
}
