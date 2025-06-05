public class climbStairs {
    public static int ClimbStairs(int n) {
        if(n==0 || n==1) {
            return 1;
        }

        return ClimbStairs(n-1)+ClimbStairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(ClimbStairs(4));
    }
}
