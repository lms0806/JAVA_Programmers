class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for(int i = 0; i < num_list.length; i++){
            answer[num_list[i] % 2]++;
        }
        return answer;
    }
}
