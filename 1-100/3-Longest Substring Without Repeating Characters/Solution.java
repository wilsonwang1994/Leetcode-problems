class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Map<Character, Integer> hashMap = new HashMap<>();
        for(int i=0, j=0; i<s.length(); i++){
            if(hashMap.containsKey(s.charAt(i))){
                j = Math.max(j, hashMap.get(s.charAt(i)) + 1);
            }
            hashMap.put(s.charAt(i), i);
            result = Math.max(result, i-j+1);
        }
        return result;
    }
}
