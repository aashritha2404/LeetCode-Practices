import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        tableFor(a);
    }

    public static void tableWhile(int a){
        System.out.println("Print table " + a);
        int i = 1;
        while(i <= 10){
            System.out.print("" +a);
            System.out.print("*\t " +i);
            System.out.println("= " +(a*i));
            i++;
        }
    }

    public static void tableFor(int a){
        System.out.println("Print table " + a);
        for(int i=1; i<=10; i++){
            System.out.println(a + "X" + i + "=" + a*i);
        }
    }
}
