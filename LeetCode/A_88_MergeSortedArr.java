public class A_88_MergeSortedArr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int p1 = 0;
        int p2 = 0;

        while(p1<m && p2<n) {
            if (nums1[p1] < nums2[p2]) {
                arr[m + n] = nums1[p1];
                p1++;
            }else {
                arr[m+n] = nums2[p2];
                p2++;
            }
        }
        while (p1<m){
            arr[m+n] = nums1[p1];
            p1++;
        }
        while (p2<n){
            arr[m+n] = nums2[p2];
            p2++;
        }
        for (int i = 0; i < m+n; i++) {
            nums1[i] = arr[i];
        }
    }
}
