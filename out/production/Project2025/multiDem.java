import java.util.Arrays;

public class multiDem {
    public static void main(String[] args) {

        int [][] multiNumbers= {{2,3,4,},{3,3,3}};

        multiNumbers[0][1] = 9;

        System.out.println(Arrays.deepToString(multiNumbers));

    }
}
