class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> charMap = new HashMap<>();

        for(char c : text.toCharArray())
        {
            if("balon".indexOf(c) !=-1){
            charMap.put(c, charMap.getOrDefault(c,0)+1);
            }
        }
        
        if(charMap.size()<5){
            return 0;
        }
        charMap.put('l',charMap.get('l')/2);
        charMap.put('o',charMap.get('o')/2);
        return Collections.min(charMap.values());
    }
}