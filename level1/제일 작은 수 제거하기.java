class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[] {-1};
        }
        
        int[] answer = new int[arr.length - 1];
        int min = Integer.MAX_VALUE;
        
        for(int a : arr){
            min = Math.min(min, a);
        }
        
        int idx = 0;
        for(int a : arr){
            if(min != a){
                answer[idx++] = a;
            }
        }
        return answer;
    }
}
