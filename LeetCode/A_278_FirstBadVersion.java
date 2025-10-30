public class A_278_FirstBadVersion {
    boolean isBadVersion(int version) {
        // dummy implementation for testing
        return version >= 4; // suppose version 4 is the first bad version
    }
    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;
        int answer = 0;

        while (left<=right){
            int mid = left+(right-left)/2;
            if(!isBadVersion(mid)){
                left = mid+1;
            }else {
                answer = mid;
                right = mid-1;
            }
        }
        return answer;
    }
}
