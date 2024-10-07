import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = sc.nextInt();

        fibonacciCheck(num);

        sc.close();
    }

    public static void fibonacciCheck(int num){

        int a = 0, b = 1;

        if (num == 0 || num == 1){
            System.out.println("Number is in Fibonacci sequence.");
        }

        while(b <= num){
            if(b == num){
                System.out.println("Number is in Fibonacci sequence.");
                break;
            }
            int i = a + b;
            a = b;
            b = i;
        }

        if (b > num){
            System.out.println("Number is not in Fibonacci sequence.");
        }
    }
}