class Solution {
    public int solution(int[] num_list) {
        String a = "", b = "";
        for(int n : num_list) {
        	if(n % 2 == 0) {
        		b += n;
        	}
        	else {
        		a += n;
        	}
        }
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
