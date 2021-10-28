class Solution {
    static int[][] answer;
    static int count = 0;
    public int[][] solution(int n) {
        answer = new int[(int) (Math.pow(2, n) - 1)][2];
        hanoi(1, 3, n);
        return answer;
    }
    
    public static void hanoi(int from, int to, int n) {
		if(n == 1) {
            answer[count][0] = from;
            answer[count][1] = to;
            count++;
			return;
		}
		
		hanoi(from ,6 - from - to, n - 1);
        answer[count][0] = from;
        answer[count][1] = to;
        count++;
		hanoi(6 - from - to, to, n - 1);
		return;
	}
}
