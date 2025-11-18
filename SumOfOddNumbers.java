import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sumOfOddNumbers(a);
    }

    public static void sumOfOddNumbers(int a){
        int sum = 0;
           for(int i=1; i <= a; i++){
               if( i%2 != 0){
                   sum += i;
               }
           }
        System.out.println("Sum " +sum);
        }
}
