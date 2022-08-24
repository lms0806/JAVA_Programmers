class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] arr = new int[8];//rt cf jm an
        char[] chs = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for(int i = 0; i < survey.length; i++){
            if(choices[i] == 4){
                continue;
            }
            
            int idx = 0;
            for(int j = 0; j < arr.length; j++){
                if(survey[i].charAt(0) == chs[j]){
                    idx = j;
                    break;
                }
            }
            
            if(choices[i] > 4){
                idx += idx % 2 == 0 ? 1 : -1;
                arr[idx] += choices[i] - 4;
            }
            else{
                arr[idx] += 4 - choices[i];
            }
        }
        
        for(int i = 0; i < arr.length; i += 2){
            if(arr[i] < arr[i + 1]){
                answer += chs[i + 1];
            }
            else{
                answer += chs[i];
            }
        }
        return answer;
    }
}
