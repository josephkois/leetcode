public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        //[1, 2, ..., n]
        int leftPointer = 1;
        int rightPointer = n;

        if (n == 1){
            return 1;
        }
        while (leftPointer <= rightPointer) {
            int middle = leftPointer + (rightPointer - leftPointer) / 2;
            if (isBadVersion(int middle)) {
                rightPointer = middle - 1;
            } else {
                leftPointer = middle + 1;
            } 
        }
        return leftPointer;
    }
}