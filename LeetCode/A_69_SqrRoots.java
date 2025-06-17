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
        System.out.println(mySqrRoot(8));
    }
}
