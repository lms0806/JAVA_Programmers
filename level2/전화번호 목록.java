class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i = 0; i < phone_book.length; i++){
            for(int j = i+1; j < phone_book.length; j++){
                if(phone_book[j].indexOf(phone_book[i]) == 0 || phone_book[i].indexOf(phone_book[j]) == 0){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}
