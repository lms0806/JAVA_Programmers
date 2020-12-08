class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        if(arr.length == 1){
            size = 1;
        }
        else{
            size = arr.length-1;
        }
        int[] answer = new int[size];
        
        int num = arr[0];
        if(answer.length == 1){
            answer[0] = -1;
            return answer;
        }
        else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < num){
                    num = arr[i];
                }
            }
            int j = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != num){
                    answer[j] = arr[i];
                    j++;
                }
            }
        }
        return answer;
    }
}
