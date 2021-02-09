class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] num = new int[n];
        String[] str = new String[n];
        
        for(int i = 0; i < n; i++){
            num[i] = arr1[i] | arr2[i];
            str[i] = Integer.toBinaryString(num[i]);
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
                    if(str[i].substring(j,j+1).equals("1")){
                        answer[i]+="#";
                    }
                    else{
                        answer[i]+=" ";
                    }
                }
                else{
                    if(str[i].substring(j).equals("1")){
                        answer[i]+="#";
                    }
                    else{
                        answer[i]+=" ";
                    }
                }
            }
        }
        
        return answer;
    }
}
