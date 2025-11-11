public class A_55_JumpGame {

    public static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                System.out.println("Stuck at index " + i + " ⚠️ Can't move further!");
                return false;
            }

            // Update maxReach
            maxReach = Math.max(maxReach, i + nums[i]);

            // Print emoji map for this step
            System.out.print("Step " + i + " (nums[" + i + "]=" + nums[i] + "): ");
            for (int j = 0; j < nums.length; j++) {
                if (j == i) System.out.print("🔵");       // current index
                else if (j <= maxReach) System.out.print("🟢"); // reachable
                else System.out.print("⚪");             // not reachable
            }
            System.out.println();

            if (maxReach >= nums.length - 1) {
                System.out.println("✅ Can reach the end!");
                return true;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJ(nums));
    }


    public static boolean can(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reach) {
                return false;
            }
            reach = Math.max(reach, i + nums[i]);
        }
        if (reach >= nums.length) {
            return true;

        }

        return true;

    }

    public static boolean canJ(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            } else {
                maxReach = Math.max(i + nums[i], maxReach);
            }

        }
        return true;
    }
}
