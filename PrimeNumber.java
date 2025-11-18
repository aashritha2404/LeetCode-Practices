import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("The given number is " +isPrimeNumber(a) );

    }

    public static boolean isPrimeNumber(int a){
        int i = 2;
        while(i < a){
            if(a%i == 0) {
                return false;
            }
            i++;
        }

        return true;
        }
    }

