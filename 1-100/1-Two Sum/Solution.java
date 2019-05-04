class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> resultMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(resultMap.containsKey(nums[i])){
                result[0] = resultMap.get(nums[i]);
                result[1] = i;
            } else{
                resultMap.put(target-nums[i],i);
            }

        }
        return result;
    }
}
