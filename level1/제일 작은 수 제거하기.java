class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length == 1 ? 1 : arr.length - 1];
        
        if(answer.length == 1){
            answer[0] = -1;
            return answer;
        }
        else{
            int num = arr[0];
            for(int n : arr){
                if(n < num){
                    num = n;
                }
            }
            int j = 0;
            for(int n : arr){
                if(n != num){
                    answer[j++] = n;
                }
            }
        }
        return answer;
    }
}
