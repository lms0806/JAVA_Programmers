class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] alpha = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < alpha.length; i++){
            numbers = numbers.replaceAll(alpha[i], i + "");
        }
        
        return Long.parseLong(numbers);
    }
}
