public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> myHashSet = new HashSet<>();

    for (int i = 0; i< nums.length(); i++) {
        if (myHashSet.contains(nums[i])) {
            return true;
        }
        myHashSet.add(nums[i]);
    }
    return false;
}