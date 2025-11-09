import java.util.*;

public class A_350_Intersections {
    public static int[] Inter(int[] nums1, int[] nums2){

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num, map.get(num)-1);
            }
        }
        int[] myres = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            myres[i] = list.get(i);
        }
        return myres;
    }


    public static int[] inter(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j=0, k = 0;
        int[] temp = new int[Math.min(nums1.length, nums2.length)];

        while (i< nums1.length && j< nums2.length){
            if(nums1[i] == nums2[j]){
             temp[k] = nums1[i];
             k++;
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else {
                i++;
            }
        }

        return Arrays.copyOfRange(temp, 0, k);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(inters(nums1,nums2)));
    }



    public static int[] inters(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        int k=0;
        while(i< nums1.length && j< nums2.length){
            if(nums1[i] == nums2[j]) {
                nums1[k++] = nums1[i];
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]