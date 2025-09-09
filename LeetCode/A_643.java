public class A_643 {
        public double findMaxAverage(int[] nums, int k) {

            int index = 0;
            for(int i=0; i<nums.length; i++){
                for (int j = 1; j >=k ; j++) {
                    index = nums[i]+nums[j]/4;
                    index++;


                }
            }
            return 1;


    }

    public static void main(String[] args) {
        A_643 obj = new A_643();
        int[] nums= {1,12,-5,-6,50,3};
        double res = obj.findMaxAverage(nums,4);
        System.out.println(res);
    }

}
