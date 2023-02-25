class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int[][] sum = new int[discount.length][want.length];
        
        for(int i = 0; i < discount.length; i++) {
        	if(i > 0) {
        		for(int j = 0; j < want.length; j++) {
        			sum[i][j] = sum[i - 1][j];
        		}
        	}
        	
        	for(int j = 0; j < want.length; j++) {
        		if(discount[i].equals(want[j])) {
        			sum[i][j]++;
        			break;
        		}
        	}
        	
        	if(i >= 10) {
        		for(int j = 0; j < want.length; j++) {
            		if(discount[i - 10].equals(want[j])) {
            			sum[i][j]--;
            			break;
            		}
            	}
        	}
            
            if(check(sum[i], number)) {
        		answer++;
        	}
        }
        return answer;
    }
	
	public static boolean check(int[] sum, int[] number) {
		for(int i = 0; i < sum.length; i++) {
			if(sum[i] != number[i]) {
				return false;
			}
		}
		return true;
	}
}
