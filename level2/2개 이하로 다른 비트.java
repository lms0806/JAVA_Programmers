class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            String binary = Long.toBinaryString(numbers[i]);
            
            if(numbers[i] % 2 == 0){
                answer[i] = numbers[i] + 1;
            }
            else{
                int lastindex = binary.lastIndexOf("0");
                int firstindex = binary.indexOf("1", lastindex);
                
                if(lastindex == -1) {
                	numbers[i]++;
                	
                	binary = Long.toBinaryString(numbers[i]);
                	binary = binary.substring(0, 2) + "1".repeat(binary.length() - 2);
                }
                else {
                	binary = binary.substring(0, lastindex) + "1" + binary.substring(lastindex + 1, firstindex) + "0" +binary.substring(firstindex + 1, binary.length());
                }
                
                answer[i] = Long.parseLong(binary, 2);
            }
        }
        return answer;
    }
}
