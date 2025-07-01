import java.math.BigInteger;
import java.util.Scanner;

public class BigINteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigint = scanner.nextBigInteger();

            if(bigint.isProbablePrime(10)){
                System.out.println("Prime");
        }else{
                System.out.println("Not Prime");
            }
    }

}
