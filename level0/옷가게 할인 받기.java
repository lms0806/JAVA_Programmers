class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if(price >= 500000){
            price -= price / 5;
        }
        else if(price >= 300000){
            price -= price / 10;
        }
        else if(price >= 100000){
            price -= price / 20;
        }
        return price;
    }
}
