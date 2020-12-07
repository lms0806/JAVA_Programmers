class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] num = new int[4][3];
        int left = 10;
        int right = 12;
        int left1 = 0, left2 = 3;
        int right1 = 2, right2 = 3;
        
        int a = 0;
        int b = 0;
        for(int i = 0; i < 12; i++){
            num[a][b] = i+1;
            b++;
            if(b == 3){
                b = 0;
                a++;
            }
        }
        num[3][1] = 0;
        
        /*for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.println(num[i][j]);
            }
        }*/
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                if(numbers[i] == 1){
                    left2 = 0;
                }
                else if(numbers[i] == 4){
                    left2 = 1;
                }
                else{
                    left2 = 2;
                }
                left1 = 0;
                left = numbers[i];
                answer+="L";
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                if(numbers[i] == 3){
                    right2 = 0;
                }
                else if(numbers[i] == 6){
                    right2 = 1;
                }
                else{
                    right2 = 2;
                }
                right1 = 2;
                right = numbers[i];
                answer+="R";
            }
            else{
                for(int j = 0; j < num.length; j++){
                    if(numbers[i] == num[j][1]){
                        if((Math.abs(left1-1) + Math.abs(left2-j)) < (Math.abs(right1-1) + Math.abs(right2-j))){
                            left1 = 1;
                            left2 = j;
                            left = numbers[i];
                            answer+="L";
                        }
                        else if((Math.abs(left1-1) + Math.abs(left2-j)) == (Math.abs(right1-1) + Math.abs(right2-j))){
                            if(hand.equals("right")){
                                right1 = 1;
                                right2 = j;
                                right = numbers[i];
                                answer+="R";
                            }
                            else{
                                left1 = 1;
                                left2 = j;
                                left = numbers[i];
                                answer+="L";
                            }
                        }
                        else{
                            right1 = 1;
                            right2 = j;
                            right = numbers[i];
                            answer+="R";
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}
