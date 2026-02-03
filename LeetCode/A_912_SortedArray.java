import java.util.Arrays;

public class A_912_SortedArray {
    public int[] sortArray(int[] nums) {
        MergeSort(nums, 0, nums.length-1);
        return nums;
    }

    private void MergeSort(int[] arr, int left, int right){
        if(left>=right) return;

        int mid = (left+right)/2;
        MergeSort(arr,left,mid);
        MergeSort(arr, mid+1,right);
        Merge(arr,left,mid,right);
    }

    private void Merge(int[] arr, int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];

        }
            for (int j = 0; j < n2; j++) {
                R[j] = arr[mid + 1 + j];
            }
               int i=0;
               int j=0;
               int k=left;
                while (i<n1 && j<n2){
                    if(L[i]<=R[j]){
                        arr[k++] = L[i++];
                    }else{
                        arr[k++] = R[j++];
                    }
                }
                while (i<n1){
                    arr[k++] = L[i++];
                }
                while (j<n2){
                    arr[k++] = R[j++];
                }
            }












    public static int[] sortAr(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i]>nums[j]){
                    int swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        System.out.println(Arrays.toString(sortSelection(nums)));
    }




    public static int[] sortQuickSort(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

return nums;

    }

//5,4,3,2
    public static int[] sortInsertion(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i-1;

            while (j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;

        }
        return nums;
    }

    public static int[] sortSelection(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            for (int j = i+1; j < n; j++) {
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }
        return nums;
    }
        }


