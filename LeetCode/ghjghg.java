import java.util.Scanner;

public class ghjghg {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read number of elements
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int negativeCount = 0;

        // Generate all subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum < 0) {
                    negativeCount++;
                }
            }
        }

        System.out.println(negativeCount);

    }
}


//   0  1  2  3  4
//   1 -2  5 -4  1
//0    1
//1    -2
//2    5
//3    -4
//4     1

//0 1      = -1
//0 1 2    =  1-2+5 =4
//0 1 2 3  = 1-2+5 =4-4 =0
//0 1 2 3 4 =1-2+5 =4-4 =0+1=1
//1 2       3
//1 2 3    =3-4= -1
//1 2 3 4 =3-4= -1+1= 0
//2 3      =1
//2 3 4    =2
//3 4      =-3
