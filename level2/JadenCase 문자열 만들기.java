class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] str = s.split("");
        
        for(int i = 0; i < str.length; i++){
            if(i == 0){
                str[i] = str[i].toUpperCase();
            }
            else if(str[i-1].equals(" ")){
                str[i] = str[i].toUpperCase();
            }
            else{
                str[i] = str[i].toLowerCase();
            }
            answer+=str[i];
        }
        return answer;
    }
}
