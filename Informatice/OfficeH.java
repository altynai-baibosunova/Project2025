public class OfficeH {
    public static int binarySearch(int[] arr, int target) {
        // {2,5,6} target=5

       int left = 0;
       int rigth = arr.length-1; //7

        while(left<rigth){
          int mid =  (rigth+left)/2;    //left+(rigth-left)/2; //(right+left)/2

          if(arr[mid] == target){
              return mid;

          }else if(arr[mid] > target){
              rigth = mid-1;
          }else {
              left = mid+1;
          }
        }
       return -500;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int searchTarget = 7;
        int result = binarySearch(sortedArray, searchTarget);
        System.out.println(result);

    }

}
// O(log n) time compl