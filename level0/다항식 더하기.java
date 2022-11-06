class Solution {
    public String solution(String polynomial) {
        String[] s = polynomial.split(" ");
        
        int a = 0, b = 0;
        for(int i = 0; i < s.length; i += 2) {
        	if(check(s[i]) != 0) {
        		a += check(s[i]);
        	}
        	else {
        		b += Integer.parseInt(s[i]);
        	}
        }
        
        if(a != 0 && b != 0) {
        	return (a == 1 ? "" : a) + "x + " + b;
        }
        else if(a != 0) {
        	return (a == 1 ? "" : a) + "x";
        }
        else if(b != 0) {
        	return b + "";
        }
        return "";
    }
    
    public static int check(String s) {
    	if(s.contains("x")) {
    		if(s.length() == 1) {
    			return 1;
    		}
    		return Integer.parseInt(s.substring(0, s.length() - 1));
    	}
    	return 0;
    }
}
