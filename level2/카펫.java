class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int temp = (brown - 4)/2;
        
        for(int i = 0; i < temp+1; i++){
            if((temp-i) * i == yellow){
                answer[0] = temp-i+2;
                answer[1] = i+2;
                break;
            }
        }
        return answer;
    }
}
