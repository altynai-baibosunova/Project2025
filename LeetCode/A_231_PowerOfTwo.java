public class A_231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
       if(n<=0) return false;

       while(n>1){
           if(n%2!=0){
               return false;
           }
           n=n/2;
       }
       return false;
    }
}
//Input: n = 1
//Output: true
//Explanation: 20 = 1