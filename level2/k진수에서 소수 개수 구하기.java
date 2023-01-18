class Solution {
    public static int solution(int n, int k) {
        int answer = 0;
        
        String s = "";
        while(n != 0) {
        	s = n % k + s;
        	n /= k;
        }
        
        String[] str = s.replaceAll("0", " ").replaceAll("\\s+", " ").split(" ");
        
        for(int i = 0; i < str.length; i++) {
        	if(isprime(Long.parseLong(str[i]))) {
        		answer++;
        	}
        }
        
        return answer;
    }
    
    public static boolean isprime(long n) {
    	if(n < 2) {
    		return false;
    	}
    	for(int i = 2; i <= Math.sqrt(n); i++) {
    		if(n % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
