class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(s.length() != 1){
            String[] str = s.split("");
            s = "";
            for(int i = 0; i < str.length; i++){
                if(str[i].equals("1")){
                    s += str[i];
                }
            }
            answer[0]++;
            answer[1] += str.length - s.length();
            s = Integer.toBinaryString(s.length());
        }
        return answer;
    }
}
