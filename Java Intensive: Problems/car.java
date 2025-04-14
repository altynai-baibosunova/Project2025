import java.util.Scanner;

public class car {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();
        int t = scanner.nextInt();

        for (int i = 0; i < 109; i++) {
           if(v>0){
               i++;
        }

            if(v<0){
                i--;
            }


        System.out.println(t);

    }
}
}
