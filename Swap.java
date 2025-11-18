import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a number");
        int b = sc.nextInt();
        int c = b;
        b = a;
        a = c;
        System.out.print("Numbers after swapping are :" + a);
        System.out.println("\tand\t" +b);
    }
}
