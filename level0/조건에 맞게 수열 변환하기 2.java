class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true){
            boolean flag = false;
            for(int i = 0; i < arr.length; i++){
                int a = arr[i];
                
                if(a >= 50 && a % 2 == 0){
                    arr[i] /= 2;
                }
                else if(a < 50 && a % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                }
                
                if(!flag && a != arr[i]){
                    flag = true;
                }
            }
            
            if(!flag){
                break;
            }
            answer++;
        }
        return answer;
    }
}
