class Solution {
    public int[] solution(String myString) {
        String[] s = myString.split("x");
        int[] answer = new int[s.length + (myString.charAt(myString.length() - 1) == 'x' ? 1 : 0)];
        
        for(int i = 0; i < s.length; i++){
            answer[i] = s[i].length();
        }
        return answer;
    }
}
