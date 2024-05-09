class Solution {
    public String solution(String number, int k) {
        int[] arr = new int[number.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = number.charAt(i) - '0';
        }
        
        int idx = 0;
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < arr.length - k; i++){
            int max = 0;
            for(int j = idx; j <= i + k; j++){
                if(max < arr[j]){
                    max = arr[j];
                    idx = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
}
