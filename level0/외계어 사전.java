class Solution {
    public int solution(String[] spell, String[] dic) {
        for(int i = 0; i < dic.length; i++){
            if(dic[i].length() == spell.length){
                boolean flag = true;
                for(int j = 0; j < spell.length; j++){
                    if(!dic[i].contains(spell[j])){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    return 1;
                }
            }
        }
        return 2;
    }
}
