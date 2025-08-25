//
//public static List<Integer> findDisappearedNumbers(int[] nums) {
//        int n = nums.length;
//        boolean[] seen = new boolean[n + 1];
//        // index 0 unused
//        for (int num : nums) {
//        seen[num] = true;
//        }
//        List<Integer> result = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//        if (!seen[i]) {
//        result.add(i);
//        }
//        }
//        return result;
//        }
//public static void main(String[] args) {
//        int [] nums = {4,3,2,7,8,2,3,1}; // 1 2 3  6 8 // 1 2 2 3 3 4  7 8
//        System.out.println(findDisappearedNumbers(nums));
//        }
//        java