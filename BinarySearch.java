public class BinarySearch {
    public int solution(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer) {
            int middle = (leftPointer + rightPointer) / 2;
            if(nums[middle] > rightPointer) {
                rightPointer = middle - 1;
            } else if (nums[middle] < leftPointer)  {
                leftPointer = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    
}
