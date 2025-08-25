public class A_88_Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]

        */
        int[] answer = new int[m+n];
        int p1 = 0;
        int p2 = 0;

        while(p1<m && p2<n){
            if(nums1[p1]<nums2[p2]){
                answer[p1+p2] = nums1[p1];
                p1++;
            }else{
                answer[p1+p2] = nums2[p2];
                p2++;
            }
        }
        while(p2<n){
            answer[p1+p2] = nums2[p2];
            p2++;
        }
        while(p1<m){
            answer[p1+p2] = nums1[p1];
            p1++;
        }
        for (int i = 0; i < m+n; i++) {
            nums1[i] = answer[i];

        }
}}
