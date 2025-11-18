import java.util.Scanner;

public class ReverseOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The reverse of number " + a + "is" + reverseOfNumber(a));
    }

    public static int reverseOfNumber(int a){
        int reverse = 0;
        while(a>0){
            int num = a%10;
            reverse = num*10 + reverse;
            a=a/10;
        }
        return reverse;
    }
}
