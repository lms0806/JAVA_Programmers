class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        while(n != 0){
            str+=n%3;
            n /= 3;
        }
        String[] strs = str.split("");
        int nums = 1;
        for(int i = strs.length-1; i >= 0; i--){
            answer += Integer.parseInt(strs[i]) * nums;
            nums *= 3;
        }
        return answer;
    }
}
