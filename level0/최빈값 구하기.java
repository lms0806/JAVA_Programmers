class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int[] num = new int[2000];
        for(int i = 0; i < array.length; i++){
            num[array[i] + 1000]++;
        }
        
        int max = 0;
        for(int i = 0; i < 2000; i++){
            if(num[i] > max){
                max = num[i];
                answer = i - 1000;
            }
            else if(num[i] == max){
                answer = -1;
            }
        }
        return answer;
    }
}
