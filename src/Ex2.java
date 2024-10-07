import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a String: ");
        String s = sc.nextLine();

        stringCheck(s);

        sc.close();
    }

    public static void stringCheck(String s){
        int quantity = 0;
        if (s.contains("a") || s.contains("A")){
            System.out.println("String contains 'a'.");
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A'){
                quantity++;
            }
        }

        System.out.println("'a' quantity: " + quantity);
    }

}
