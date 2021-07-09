class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] str = new String[n];
        
        for(int i = 0; i < n; i++){
            str[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = "";
        }
        
        for(int i = 0; i < n; i++){
            if(str[i].length() < n){
                while(str[i].length() != n){
                    str[i] = "0" + str[i];
                }
            }
            
            for(int j = 0; j < n; j++){
                if(j != n-1){
                    answer[i] += str[i].substring(j, j+1).equals("1") ? "#" : " ";
                }
                else{
                    answer[i] += str[i].substring(j).equals("1") ? "#" : " ";
                }
            }
        }
        
        return answer;
    }
}
