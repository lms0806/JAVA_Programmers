class Solution {
    public int[] solution(int[] arr) {
        int s = arr.length, e = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                s = Math.min(s, i);
                e = Math.max(e, i);
            }
        }
        
        if(s == arr.length && e == 0){
            return new int[] {-1};
        }
        
        int[] answer = new int[e - s + 1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[i + s];
        }
        return answer;
    }
}
