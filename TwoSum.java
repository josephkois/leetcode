public int[] twoSum(int[] nums, int target) { 
    HashMap<Integer, Integer> myHashMap = new HashMap<>();

    for (int i = 0; i < nums.length(); i++) {
        if (myHashMap.containsKey(nums[i])) {
            return new int[]{myHashMap.get(nums[i]), i};
        }
        myHashMap.put(target - 1, nums[i], i);
    }
    return new int[0];
}