class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
        	String[] s = quiz[i].split(" ");
        	int a = Integer.parseInt(s[0]), b = Integer.parseInt(s[2]);
        	int c = Integer.parseInt(s[4]);
        	
        	if(s[1].equals("+")) {
        		answer[i] = a + b == c ? "O" : "X";
        	}
        	else {
        		answer[i] = a - b == c ? "O" : "X";
        	}
        }
        return answer;
    }
}
