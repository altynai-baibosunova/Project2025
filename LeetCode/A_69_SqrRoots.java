public class A_69_SqrRoots {
    public static int mySqrRoot(int x){
        int l=0;
        int r=x;

        while(l<=r){
            int m = l+(r-l)/2;
            long square = (long)m*m;

            if(square==x){
                return m;
            }else if(x>square){
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt2(8));
    }


    public static int mySqrt2(int x) {
        if(x==0) return 0;
        int left = 1;
        int right = x;
        int answer=0;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid<=x/mid){
                answer=mid;
                left=mid+1;

            }else {
                right=mid-1;
            }
        }
        return answer;
    }
}
