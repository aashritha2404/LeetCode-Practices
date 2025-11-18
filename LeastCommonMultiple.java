import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The least common multiple is " +leastCommonFactor(a,b));
    }

    public static int leastCommonFactor(int a, int b) {
        for (int i = 2; i < 1000; i++)
            if ((i % a == 0) && (i % b == 0)) {
                System.out.println(i);
                return i;
            }
        return 0;
    }
}
